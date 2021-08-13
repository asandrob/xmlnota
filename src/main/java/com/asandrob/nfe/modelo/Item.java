package com.asandrob.nfe.modelo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAliasType;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAliasType(value = "det")
public class Item {

	@XStreamAsAttribute()
	@XStreamAlias("nItem")
	private Short item;

	@XStreamAlias("prod")
	private Produto produto;

	@XStreamAlias("imposto")
	private Imposto imposto;

	public Short getItem() {
		return item;
	}

	public void setItem(Short item) {
		this.item = item;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Imposto getImposto() {
		return imposto;
	}

	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}
	
	public boolean isSimples() {
		return this.getImposto().isSimples();
	}

}
