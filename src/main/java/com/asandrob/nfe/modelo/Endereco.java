package com.asandrob.nfe.modelo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Endereco {
	
	@XStreamAlias("xLgr")
	private String logradouro;
	
	@XStreamAlias("nro")
	private String numero;
	
	@XStreamAlias("xBairro")
	private String bairro;
	
	@XStreamAlias("cMun")
	private Integer codigoMunicipio;
	
	@XStreamAlias("xMun")
	private String municipio;
	
	@XStreamAlias("UF")
	private String uf;
	
	@XStreamAlias("CEP")
	private String cep;
	
	@XStreamAlias("cPais")
	private Integer codigoPais;
	
	@XStreamAlias("xPais")
	private String pais;
	
	@XStreamAlias("fone")
	private String fone;

}
