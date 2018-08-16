package com.vcs.examples.transport;

public class ElektrinisDviratis extends Dviratis {

	
	/**
	 * 3 Pagrindines priezastys kada reikia extendint'i
	 * 
	 * 1) Norim prideti papildomu atrubutu 
	 * 2) Norim isplesti esama funkcionaluma
	 * 3) Norim pakeisti esama funkcionaluma
	 * 
	 * 
	 * */
	
	@Override
	public void vaziuoti() {
		reguliuotiGreiti();
		if(stebetiKliutis()) {
			stabdyti();
		}
	}

	private void reguliuotiGreiti() {
		// TODO Auto-generated method stub
		
	}
	
}
