package com.asandrob.nfe.modelo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Icms60 {

	@XStreamAlias("orig")
	private Short origem;
	
	@XStreamAlias("CST")
	private Short cst;

	public Short getOrigem() {
		return origem;
	}

	public void setOrigem(Short origem) {
		this.origem = origem;
	}

	public Short getCst() {
		return cst;
	}

	public void setCst(Short cst) {
		this.cst = cst;
	}
	

}
