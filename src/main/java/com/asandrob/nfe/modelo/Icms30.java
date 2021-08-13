package com.asandrob.nfe.modelo;

import java.math.BigDecimal;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Icms30 {

	@XStreamAlias("orig")
	private Short origem;

	@XStreamAlias("CST")
	private Short cst;

	@XStreamAlias("modBCST")
	private Short modalidadeBCST;

	@XStreamAlias("pMVAST")
	private Short percentualMVAST;

	@XStreamAlias("pRedBCST")
	private BigDecimal percentualRedBCST;

	@XStreamAlias("vBCST")
	private BigDecimal baseCalculoST;

	@XStreamAlias("pICMSST")
	private BigDecimal aliquotaST;

	@XStreamAlias("vICMSST")
	private BigDecimal valorST;

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

	public Short getModalidadeBCST() {
		return modalidadeBCST;
	}

	public void setModalidadeBCST(Short modalidadeBCST) {
		this.modalidadeBCST = modalidadeBCST;
	}

	public Short getPercentualMVAST() {
		return percentualMVAST;
	}

	public void setPercentualMVAST(Short percentualMVAST) {
		this.percentualMVAST = percentualMVAST;
	}

	public BigDecimal getPercentualRedBCST() {
		return percentualRedBCST;
	}

	public void setPercentualRedBCST(BigDecimal percentualRedBCST) {
		this.percentualRedBCST = percentualRedBCST;
	}

	public BigDecimal getBaseCalculoST() {
		return baseCalculoST;
	}

	public void setBaseCalculoST(BigDecimal baseCalculoST) {
		this.baseCalculoST = baseCalculoST;
	}

	public BigDecimal getAliquotaST() {
		return aliquotaST;
	}

	public void setAliquotaST(BigDecimal aliquotaST) {
		this.aliquotaST = aliquotaST;
	}

	public BigDecimal getValorST() {
		return valorST;
	}

	public void setValorST(BigDecimal valorST) {
		this.valorST = valorST;
	}

	
}
