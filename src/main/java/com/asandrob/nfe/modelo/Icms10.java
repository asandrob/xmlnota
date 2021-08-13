package com.asandrob.nfe.modelo;

import java.math.BigDecimal;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Icms10 {
	@XStreamAlias("orig")
	private Short origem;
	
	@XStreamAlias("CST")
	private Short cst;
	
	@XStreamAlias("modBC")
	private Short modalidade;
	
	@XStreamAlias("vBC")
	private BigDecimal baseCalculo;
	
	@XStreamAlias("pICMS")
	private BigDecimal aliquota;
	
	@XStreamAlias("vICMS")
	private BigDecimal valor;
	
	@XStreamAlias("modBCST")
	private Short modalidadeST;
	
	@XStreamAlias("pMVAST")
	private BigDecimal percentualMVA;

	@XStreamAlias("pRedBCST")
	private BigDecimal percentualReducaoBCIcmsST;
	
	@XStreamAlias("vBCST")
	private BigDecimal valorBCIcmsST;
	
	@XStreamAlias("pICMSST")
	private BigDecimal aliquotaIcmsST;

	@XStreamAlias("vICMSST")
	private BigDecimal valorIcmsST;

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

	public Short getModalidade() {
		return modalidade;
	}

	public void setModalidade(Short modalidade) {
		this.modalidade = modalidade;
	}

	public BigDecimal getBaseCalculo() {
		return baseCalculo;
	}

	public void setBaseCalculo(BigDecimal baseCalculo) {
		this.baseCalculo = baseCalculo;
	}

	public BigDecimal getAliquota() {
		return aliquota;
	}

	public void setAliquota(BigDecimal aliquota) {
		this.aliquota = aliquota;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Short getModalidadeST() {
		return modalidadeST;
	}

	public void setModalidadeST(Short modalidadeST) {
		this.modalidadeST = modalidadeST;
	}

	public BigDecimal getPercentualMVA() {
		return percentualMVA;
	}

	public void setPercentualMVA(BigDecimal percentualMVA) {
		this.percentualMVA = percentualMVA;
	}

	public BigDecimal getPercentualReducaoBCIcmsST() {
		return percentualReducaoBCIcmsST;
	}

	public void setPercentualReducaoBCIcmsST(BigDecimal percentualReducaoBCIcmsST) {
		this.percentualReducaoBCIcmsST = percentualReducaoBCIcmsST;
	}

	public BigDecimal getValorBCIcmsST() {
		return valorBCIcmsST;
	}

	public void setValorBCIcmsST(BigDecimal valorBCIcmsST) {
		this.valorBCIcmsST = valorBCIcmsST;
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
