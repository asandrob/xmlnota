package com.asandrob.nfe.modelo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Imposto {

	@XStreamAlias("ICMS")
	private Icms icms;

	public Icms getIcms() {
		return icms;
	}

	public void setIcms(Icms icms) {
		this.icms = icms;
	}
	
	public boolean isSimples() {
		return this.getIcms().isSimples();
	}
	
	
}
