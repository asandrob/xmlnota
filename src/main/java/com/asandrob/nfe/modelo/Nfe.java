package com.asandrob.nfe.modelo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("NFe")
public class Nfe {

	@XStreamAlias("infNFe")
	private InformacoesNfe informacoesNfe;

	public InformacoesNfe getInformacoesNfe() {
		return informacoesNfe;
	}

	public void setInformacoesNfe(InformacoesNfe informacoesNfe) {
		this.informacoesNfe = informacoesNfe;
	}
	
	public Fornecedor getFornecedor() {
		this.getInformacoesNfe().getFornecedor().setSimples(this.getInformacoesNfe().isSimples());
		return this.getInformacoesNfe().getFornecedor();
	}

	
	public String toString() {
		return getInformacoesNfe().getChaveNfe();
	}
	
	
}
