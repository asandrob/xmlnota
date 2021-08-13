package com.asandrob.nfe.modelo;

import java.math.BigDecimal;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Produto {

	@XStreamAlias("cProd")
	private String codigo;
	
	@XStreamAlias("xProd")
	private String descrição;
	
	@XStreamAlias("NCM")
	private BigDecimal ncm;
	
	@XStreamAlias("CFOP")
	private BigDecimal CFOP;

	@XStreamAlias("CEST")
	private String cest;
	
	@XStreamAlias("vProd")
	private Double valorTotal;
	
	@XStreamAlias("vUnTrib")
	private Double valorUnitario;
	
	@XStreamAlias("qTrib")
	private Double quantidade;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public BigDecimal getNcm() {
		return ncm;
	}

	public void setNcm(BigDecimal ncm) {
		this.ncm = ncm;
	}

	public BigDecimal getCFOP() {
		return CFOP;
	}

	public void setCFOP(BigDecimal cFOP) {
		CFOP = cFOP;
	}

	public String getCest() {
		return cest;
	}

	public void setCest(String cest) {
		this.cest = cest;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
