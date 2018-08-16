package com.vcs.examples.transport;

public class Dviratis extends TransportoPriemone {

	public Dviratis() {

		super("Rambynas");

		setRatuKiekis(2);
		setVietuKiekis(2);
		setVariklis(ENGINE_NONE);

	}
	
	public void vaziuoti() {
		mintiPedalus();
		if(stebetiKliutis()) {
			stabdyti();
		}
	}
	
	protected final void mintiPedalus() {
		System.out.println("minam...");
	}

	protected final boolean stebetiKliutis() {
		
		System.out.println("yra kliutis !");
		return true;
	}
	
	protected final void stabdyti() {
		System.out.println("STOP!!!!");
	}

}
