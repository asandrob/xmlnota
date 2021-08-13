package com.asandrob.nfe.modelo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Icms {

	@XStreamAlias("ICMS00")
	private Icms00 icms00;

	@XStreamAlias("ICMS10")
	private Icms10 icms10;

	@XStreamAlias("ICMS20")
	private Icms20 icms20;

	@XStreamAlias("ICMS30")
	private Icms30 icms30;

	@XStreamAlias("ICMS60")
	private Icms60 icms60;

	@XStreamAlias("ICMSSN101")
	private IcmsSN101 icmsSN101;

	@XStreamAlias("ICMSSN102")
	private IcmsSN102 icmsSN102;

	@XStreamAlias("ICMSSN201")
	private IcmsSN201 icmsSN201;

	@XStreamAlias("ICMSSN202")
	private IcmsSN202 icmsSN202;

	@XStreamAlias("ICMSSN500")
	private IcmsSN500 icmsSN500;

	@XStreamAlias("ICMSSN900")
	private IcmsSN900 icmsSN900;

	public Icms00 getIcms00() {
		return icms00;
	}

	public void setIcms00(Icms00 icms00) {
		this.icms00 = icms00;
	}

	public Icms10 getIcms10() {
		return icms10;
	}

	public void setIcms10(Icms10 icms10) {
		this.icms10 = icms10;
	}

	public Icms20 getIcms20() {
		return icms20;
	}

	public void setIcms20(Icms20 icms20) {
		this.icms20 = icms20;
	}

	public Icms30 getIcms30() {
		return icms30;
	}

	public void setIcms30(Icms30 icms30) {
		this.icms30 = icms30;
	}

	public Icms60 getIcms60() {
		return icms60;
	}

	public void setIcms60(Icms60 icms60) {
		this.icms60 = icms60;
	}

	public IcmsSN101 getIcmsSN101() {
		return icmsSN101;
	}

	public void setIcmsSN101(IcmsSN101 icmsSN101) {
		this.icmsSN101 = icmsSN101;
	}

	public IcmsSN102 getIcmsSN102() {
		return icmsSN102;
	}

	public void setIcmsSN102(IcmsSN102 icmsSN102) {
		this.icmsSN102 = icmsSN102;
	}

	public IcmsSN201 getIcmsSN201() {
		return icmsSN201;
	}

	public void setIcmsSN201(IcmsSN201 icmsSN201) {
		this.icmsSN201 = icmsSN201;
	}

	public IcmsSN202 getIcmsSN202() {
		return icmsSN202;
	}

	public void setIcmsSN202(IcmsSN202 icmsSN202) {
		this.icmsSN202 = icmsSN202;
	}

	public IcmsSN500 getIcmsSN500() {
		return icmsSN500;
	}

	public void setIcmsSN500(IcmsSN500 icmsSN500) {
		this.icmsSN500 = icmsSN500;
	}

	public IcmsSN900 getIcmsSN900() {
		return icmsSN900;
	}

	public void setIcmsSN900(IcmsSN900 icmsSN900) {
		this.icmsSN900 = icmsSN900;
	}

	public boolean isSimples() {
		if (icmsSN101 != null || icmsSN102 != null || icmsSN201 != null || icmsSN202 != null || icmsSN500 != null
				|| icmsSN900 != null) {
			return true;
		}
		return false;
	}

}
