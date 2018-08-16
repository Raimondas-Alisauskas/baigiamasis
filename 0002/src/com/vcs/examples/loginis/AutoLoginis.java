package com.vcs.examples.loginis;

public class AutoLoginis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AutoLoginis musuObjektas = new AutoLoginis();

		boolean result = musuObjektas.arPilnasIrLyginis(234, 324, true);

		System.out.println("Tai yra mums dviem vietos ar ne?: " + result);

	}

	// :)
	private boolean arPilnasIrLyginis(int keleiviuSk, int autoTalpa, boolean arLyginis) {

		int laisvosVietos = keleiviuSk % autoTalpa;

		// Ar likes vietu skaicius lyginis
		boolean arLikoLyginis = (laisvosVietos % 2) == 0;

		// Jei musm rupi ar lyginis skaicius liko ir jis yra lyginis, tik tada grazinam
		// TRUE
		return arLikoLyginis && arLyginis && (laisvosVietos > 0);

	}

}
