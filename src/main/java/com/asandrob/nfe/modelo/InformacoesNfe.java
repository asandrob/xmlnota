package com.asandrob.nfe.modelo;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

public class InformacoesNfe {

	@XStreamAsAttribute()
	@XStreamAlias("Id")
	private String chaveNfe;

	@XStreamAlias("ide")
	private InformacoesIdentificacaoNfe informacoesIdentificacaoNfe;

	@XStreamAlias("emit")
	private Fornecedor fornecedor;

	@XStreamAlias("dest")
	private Cliente cliente;

	@XStreamImplicit
	List<Item> itens = new ArrayList<>();

	@XStreamOmitField
	private boolean jaPassei;

	@XStreamOmitField
	private boolean simples;

	public String getChaveNfe() {
		return chaveNfe.substring(3, 47);
	}

	public void setChaveNfe(String chaveNfe) {
		this.chaveNfe = chaveNfe;
	}

	public InformacoesIdentificacaoNfe getInformacoesIdentificacaoNfe() {
		return informacoesIdentificacaoNfe;
	}

	public void setInformacoesIdentificacaoNfe(InformacoesIdentificacaoNfe informacoesIdentificacaoNfe) {
		this.informacoesIdentificacaoNfe = informacoesIdentificacaoNfe;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	public boolean isSimples() {
		if (jaPassei) {
			return this.simples;
		}
		long contagem = itens
						.stream()
						.filter(it -> it.isSimples() == true)
						.count();
		this.jaPassei = true;
		if (contagem !=0) {
			this.simples = true;
		} else {
			this.simples = false;
		}
		return simples;
	}

}
