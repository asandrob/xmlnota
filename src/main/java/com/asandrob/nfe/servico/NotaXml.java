package com.asandrob.nfe.servico;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.asandrob.nfe.modelo.Nfe;
import com.asandrob.nfe.modelo.NfeProcessada;
import com.asandrob.util.io.Util;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.StreamException;
import com.thoughtworks.xstream.mapper.CannotResolveClassException;
import com.thoughtworks.xstream.security.NoTypePermission;
import com.thoughtworks.xstream.security.NullPermission;
import com.thoughtworks.xstream.security.PrimitiveTypePermission;

public class NotaXml {
	private String diretorioRaiz;
	private String extensao;
//	private XStream xstreamNfeProcessada;
//	private XStream xstreamNfeNaoProcessada;
	private StringBuilder erros;
	
	public void diretorioRaiz(String root, String extensao) {
		this.diretorioRaiz = root;
		this.extensao = extensao;
	}
	
	public List<Nfe> getNfes() {
		XStream xstreamNfeProcessada = criarStreamXML(NfeProcessada.class);
		XStream xstreamNfeNaoProcessada = criarStreamXML(Nfe.class);
		List<Nfe> notasProcessadas = new ArrayList<>();
		Util util = new Util();
		List<String> listaArquivos = util.listaArquivos(diretorioRaiz, extensao);
		util = null;
		
		for (String arquivo : listaArquivos) {
			File file = new File(arquivo);
			try {
				notasProcessadas.add(((NfeProcessada) xstreamNfeProcessada.fromXML(file)).getNfe());
			} catch (ClassCastException e) {
				notasProcessadas.add((Nfe) xstreamNfeNaoProcessada.fromXML(file));
			} catch (StreamException | CannotResolveClassException e) {
				System.out.println("deu erro nessa: " + arquivo);
				erro(e.getCause().getMessage());
				erro(e.getMessage());
				erro("Arquivo: " + arquivo);
			}
				
		}
		xstreamNfeProcessada = null;
		xstreamNfeNaoProcessada = null;
		return notasProcessadas;
	}
	
	public StringBuilder getErros() {
		return erros;
	}
	
	private XStream criarStreamXML(Class<?> classe) {
		XStream stream = new XStream();
		stream.ignoreUnknownElements();
		stream.processAnnotations(classe);
		// clear out existing permissions and set own ones
		stream.addPermission(NoTypePermission.NONE);
		// allow some basics
		stream.addPermission(NullPermission.NULL);
		stream.addPermission(PrimitiveTypePermission.PRIMITIVES);
		stream.allowTypeHierarchy(Collection.class);
		// allow any type from the same package
		stream.allowTypesByWildcard(new String[] {"com.asandrob.nfe.modelo.**"});
		return stream;
	}

	
	private void erro(String erro) {
		if (erros == null)
			erros = new StringBuilder();
		erros.append(erro + "\n");
	}
	
	

}
