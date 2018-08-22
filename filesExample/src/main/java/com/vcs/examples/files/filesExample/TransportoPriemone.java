package com.vcs.examples.files.filesExample;

public class TransportoPriemone {

	public static final String ENGINE_NONE = "nera";

	// dviratis, kateris, automobilis
	private String pavadinimas;
	private int ratuKiekis;
	private String variklis;
	private int vietuKiekis;
	private boolean cargo = false;

	public TransportoPriemone(String pavadinimas) {
		this.pavadinimas = pavadinimas;

	}

	// Ar krovininis
	protected boolean isCargo() {
		return cargo;
	}

	public final String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public int getRatuKiekis() {
		return ratuKiekis;
	}

	public void setRatuKiekis(int ratuKiekis) {
		this.ratuKiekis = ratuKiekis;
	}

	public String getVariklis() {
		return variklis;
	}

	public void setVariklis(String variklis) {
		this.variklis = variklis;
	}

	public int getVietuKiekis() {
		return vietuKiekis;
	}

	public void setVietuKiekis(int vietuKiekis) {
		this.vietuKiekis = vietuKiekis;
	}

}
