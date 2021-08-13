package com.asandrob.nfe.modelo;

import java.math.BigDecimal;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class IcmsSN101 extends IcmsSNBase {
	
	@XStreamAlias("pCredSN")
	private BigDecimal aliquota;
	
	@XStreamAlias("vCredICMSSN")
	private BigDecimal valorCredito;

	public BigDecimal getAliquota() {
		return aliquota;
	}

	public void setAliquota(BigDecimal aliquota) {
		this.aliquota = aliquota;
	}

	public BigDecimal getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(BigDecimal valorCredito) {
		this.valorCredito = valorCredito;
	}


}
