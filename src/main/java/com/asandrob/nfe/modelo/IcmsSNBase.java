package com.asandrob.nfe.modelo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class IcmsSNBase {
	
	@XStreamAlias("orig")
	private Short origem;

	@XStreamAlias("CSOSN")
	private Short csosn;

	public Short getOrigem() {
		return origem;
	}

	public void setOrigem(Short origem) {
		this.origem = origem;
	}

	public Short getCsosn() {
		return csosn;
	}

	public void setCsosn(Short csosn) {
		this.csosn = csosn;
	}

	

}
