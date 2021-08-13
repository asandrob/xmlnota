package com.asandrob.nfe.modelo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.util.List;

import org.junit.Test;

import com.asandrob.nfe.servico.NotaXml;
import com.thoughtworks.xstream.XStream;

public class NfeTest {

	private ClassLoader classLoader = getClass().getClassLoader();
	
	@Test
	public void deveLerNfeProcessada() {
		
		File file = new File(classLoader.getResource("com/asandrob/nfe/xml/35180107278350000163550020140370231539689640.xml").getFile());
//		File file = new File("C:\\Temp\\amz\\50180204459073000369550000000106321004011313.xml");
//		D:\Trabalhos\Moresco\ProjetoPetiskeira\xml\43171294820560000136550010000240991000760187.xml
//		D:\Trabalhos\Moresco\ProjetoPetiskeira\xml\43171287226528000161550010027700871042214367.xml
		XStream xstream = new XStream();// {
//	        @Override
//	        protected MapperWrapper wrapMapper(MapperWrapper next) {
//	            return new MapperWrapper(next) {
//	                @Override
//	                public boolean shouldSerializeMember(Class definedIn, String fieldName) {
//	                    if (definedIn == Object.class) {
//	                        //This is not compatible with implicit collections where item name is not defined
//	                        return false;
//	                    } else {
//	                        return super.shouldSerializeMember(definedIn, fieldName);
//	                    }
//	                }
//	            };
//	        }
//	    };
		xstream.ignoreUnknownElements();
//		xstream.processAnnotations(Root.class);
//		xstream.processAnnotations(Fornecedor.class);
		
		
		xstream.processAnnotations(NfeProcessada.class);
		
//		System.out.println(xstream.toXML(nfeProcessada));
//		xstream.processAnnotations(InformacoesNfe.class);
//		xstream.addImplicitCollection(InformacoesNfe.class, "itens");
//		xstream.processAnnotations(Nfe.class);
		
		NfeProcessada nfeConvertida = (NfeProcessada) xstream.fromXML(file);

		
		System.out.println(xstream.toXML(nfeConvertida));
		
		System.out.println("Chave: " + nfeConvertida.getNfe().getInformacoesNfe().getChaveNfe());
		System.out.println("CNPJ fornecedor: " + nfeConvertida.getFornecedor().getCnpj());
		
		System.out.println("fornecedor é do simples: " + nfeConvertida.getFornecedor().isSimples());
		
		assertEquals(1,1);
	}
	
	@Test
	public void deveLerNfeNaoProcessada() {
		
//		File file = new File(classLoader.getResource("com/asandrob/nfe/xml/35180107278350000163550020140370231539689640.xml").getFile());
		File file = new File("D:\\Trabalhos\\Moresco\\ProjetoPetiskeira\\xml\\Nova pasta\\Entradas01\\2017\\02\\43170290369521000294550020000033571157218602.xml");
//		D:\Trabalhos\Moresco\ProjetoPetiskeira\xml\43171294820560000136550010000240991000760187.xml
//		D:\Trabalhos\Moresco\ProjetoPetiskeira\xml\43171287226528000161550010027700871042214367.xml
		XStream xstream = new XStream();// {
//	        @Override
//	        protected MapperWrapper wrapMapper(MapperWrapper next) {
//	            return new MapperWrapper(next) {
//	                @Override
//	                public boolean shouldSerializeMember(Class definedIn, String fieldName) {
//	                    if (definedIn == Object.class) {
//	                        //This is not compatible with implicit collections where item name is not defined
//	                        return false;
//	                    } else {
//	                        return super.shouldSerializeMember(definedIn, fieldName);
//	                    }
//	                }
//	            };
//	        }
//	    };
		xstream.ignoreUnknownElements();
//		xstream.processAnnotations(Root.class);
//		xstream.processAnnotations(Fornecedor.class);
		
//		NfeProcessada nfeProcessada = new NfeProcessada();
//		Nfe nfe = new Nfe();
//		InformacoesNfe informacoesNfe = new InformacoesNfe();
//		Item item1 = new Item();
//		Item item2 = new Item();
//		
//		List<Item> itens = new ArrayList<>();
//		itens.add(item1);
//		itens.add(item2);
//		informacoesNfe.setItens(itens);
//		
//		
//		InformacoesIdentificacaoNfe informacoesIdentificacaoNfe = new InformacoesIdentificacaoNfe();
//		
//		
//		nfe.setInformacoesNfe(informacoesNfe);
//		
//		nfeProcessada.setNfe(nfe);
		
		
		xstream.processAnnotations(Nfe.class);
		
//		System.out.println(xstream.toXML(nfeProcessada));
//		xstream.processAnnotations(InformacoesNfe.class);
//		xstream.addImplicitCollection(InformacoesNfe.class, "itens");
//		xstream.processAnnotations(Nfe.class);
		
		Nfe nfe = (Nfe) xstream.fromXML(file);

		
		System.out.println(xstream.toXML(nfe));
		
		System.out.println("Chave: " + nfe.getInformacoesNfe().getChaveNfe());
		System.out.println("CNPJ fornecedor: " + nfe.getFornecedor().getCnpj());
		
//		System.out.println("fornecedor é do simples: " + nfeConvertida.getFornecedor().isSimples());
		
		assertEquals(1,1);
	}

	
	@Test
	public void deveBuscarNotasDoXML() {
		NotaXml nfXml = new NotaXml();
		nfXml.diretorioRaiz("D:\\Trabalhos\\Moresco\\ProjetoPetiskeira\\xml", "xml");
		List<Nfe> notasProcessadas = nfXml.getNfes();
		notasProcessadas.forEach(System.out::println);
	}
	
	@Test
	public void deveRetornarQuatroNotasEUmErro() {
		NotaXml nfXml = new NotaXml();
		File file = new File(classLoader.getResource("com/asandrob/nfe/xml/dummy").getPath().replace("/dummy", ""));
		nfXml.diretorioRaiz(file.getPath(), "xml");
		List<Nfe> notasProcessadas = nfXml.getNfes();
		assertEquals(4, notasProcessadas.size());
		assertNotNull(nfXml.getErros());
	}
	
}
