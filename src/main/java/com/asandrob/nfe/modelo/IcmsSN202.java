package com.asandrob.nfe.modelo;

import java.math.BigDecimal;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class IcmsSN202 extends IcmsSNBase {

	@XStreamAlias("modBCST")
	private Short modalidadeBC;

	@XStreamAlias("pMVAST")
	private BigDecimal percentualMVA;

	@XStreamAlias("pRedBCST")
	private BigDecimal percentualReducaoBC;

	@XStreamAlias("vBCST")
	private BigDecimal baseCalculo;

	@XStreamAlias("pICMSST")
	private BigDecimal aliquotaIcmsST;

	@XStreamAlias("vICMSST")
	private BigDecimal valorIcmsST;

	public Short getModalidadeBC() {
		return modalidadeBC;
	}

	public void setModalidadeBC(Short modalidadeBC) {
		this.modalidadeBC = modalidadeBC;
	}

	public BigDecimal getPercentualMVA() {
		return percentualMVA;
	}

	public void setPercentualMVA(BigDecimal percentualMVA) {
		this.percentualMVA = percentualMVA;
	}

	public BigDecimal getPercentualReducaoBC() {
		return percentualReducaoBC;
	}

	public void setPercentualReducaoBC(BigDecimal percentualReducaoBC) {
		this.percentualReducaoBC = percentualReducaoBC;
	}

	public BigDecimal getBaseCalculo() {
		return baseCalculo;
	}

	public void setBaseCalculo(BigDecimal baseCalculo) {
		this.baseCalculo = baseCalculo;
	}

	public BigDecimal getAliquotaIcmsST() {
		return aliquotaIcmsST;
	}

	public void setAliquotaIcmsST(BigDecimal aliquotaIcmsST) {
		this.aliquotaIcmsST = aliquotaIcmsST;
	}

	public BigDecimal getValorIcmsST() {
		return valorIcmsST;
	}

	public void setValorIcmsST(BigDecimal valorIcmsST) {
		this.valorIcmsST = valorIcmsST;
	}

}
