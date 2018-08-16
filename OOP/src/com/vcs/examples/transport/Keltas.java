package com.vcs.examples.transport;

public class Keltas extends Kateris {

	public Keltas(String pavadinimas) {
		super(pavadinimas);
	}

	private int trapuKiekis;

	public int getTrapuKiekis() {
		return trapuKiekis;
	}

	public void setTrapuKiekis(int trapuKiekis) {
		this.trapuKiekis = trapuKiekis;
	}

//	@Override
//	public String getPavadinimas() {
//		// Jei reikia gauti tevine metodo implementacija
//		// super.getTipas()
//		return "Keltas: " + super.getOriginalType();
//	}

}
