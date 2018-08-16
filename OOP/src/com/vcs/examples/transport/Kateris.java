package com.vcs.examples.transport;

public class Kateris extends TransportoPriemone {

	public Kateris(String pavadinimas) {
		super(pavadinimas);
	}

	private int propeleriuKiekis;

	public int getPropeleriuKiekis() {
		return propeleriuKiekis;
	}

	public void setPropeleriuKiekis(int propeleriuKiekis) {
		this.propeleriuKiekis = propeleriuKiekis;
	}

	@Override
	public int getRatuKiekis() {
		return 0;
	}

	
	
	public String getKaterioPavadinimas() {
		// Jei reikia gauti tevine metodo implementacija
		// super.getTipas()
		return "Kateris" + (isCargo() ? " (cargo)" : " (pramoginis)");
	}
	
	protected String getOriginalType() {
		return super.getPavadinimas();
	}

}
