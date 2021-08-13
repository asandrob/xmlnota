package com.asandrob.nfe.modelo;

import java.math.BigDecimal;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Icms20 {
	
	@XStreamAlias("orig")
	private Short origem;
	
	@XStreamAlias("CST")
	private Short cst;
	
	@XStreamAlias("modBC")
	private Short modalidade;
	
	@XStreamAlias("pRedBC")
	private BigDecimal percentualRedBC;
	
	@XStreamAlias("vBC")
	private BigDecimal baseCalculo;
	
	@XStreamAlias("pICMS")
	private BigDecimal aliquota;
	
	@XStreamAlias("vICMS")
	private BigDecimal valor;

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

	public BigDecimal getPercentualRedBC() {
		return percentualRedBC;
	}

	public void setPercentualRedBC(BigDecimal percentualRedBC) {
		this.percentualRedBC = percentualRedBC;
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

	
}
