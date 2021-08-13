package com.asandrob.nfe.modelo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("nfeProc")
public class NfeProcessada {

	@XStreamAlias("NFe")
	private Nfe nfe;

	public Nfe getNfe() {
		return nfe;
	}

	public void setNfe(Nfe nfe) {
		this.nfe = nfe;
	}

	public Fornecedor getFornecedor() {
		this.getNfe().getInformacoesNfe().getFornecedor().setSimples(this.getNfe().getInformacoesNfe().isSimples());
		return this.getNfe().getInformacoesNfe().getFornecedor();
	}
	
	@Override
	public String toString() {
		return nfe.getInformacoesNfe().getChaveNfe();
	}
	
}
