package com.vcs.examples.mvn.tests;

public class NevalidusVardas extends Exception {

	private static final long serialVersionUID = 1L;

	private KlaidosTipas tipas;
	private String vardas;

	public NevalidusVardas(KlaidosTipas tipas, String vardas) {
		this.vardas = vardas;
		this.tipas = tipas;
	}

	public NevalidusVardas(String msg) {
		super(msg);
		this.vardas = null;
		this.tipas = KlaidosTipas.KRITINE;

	}

	public KlaidosTipas getTipas() {
		return tipas;
	}

	public String getVardas() {
		return vardas;
	}

}
