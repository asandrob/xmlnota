package com.asandrob.nfe.modelo;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class InformacoesIdentificacaoNfe {
	
	@XStreamAlias("mod")
	private Short modelo;
	
	@XStreamAlias("serie")
	private Short serie;
	
	@XStreamAlias("nNF")
	private Integer numero;
	
	@XStreamAlias("dhEmi")
	private Date dataEmissao;
	
	@XStreamAlias("dhSaiEnt")
	private Date dataSaidaEntrada;

	public Short getModelo() {
		return modelo;
	}
	public void setModelo(Short modelo) {
		this.modelo = modelo;
	}
	public Short getSerie() {
		return serie;
	}
	public void setSerie(Short serie) {
		this.serie = serie;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public Date getDataSaidaEntrada() {
		return dataSaidaEntrada;
	}
	public void setDataSaidaEntrada(Date dataSaidaEntrada) {
		this.dataSaidaEntrada = dataSaidaEntrada;
	}
	
}
