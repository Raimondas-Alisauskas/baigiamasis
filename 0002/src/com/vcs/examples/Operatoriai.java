package com.vcs.examples;

public class Operatoriai {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Aritmetiniai operatoriai

		int skaiciukas = 3;

		skaiciukas = skaiciukas + 5; // 8
		skaiciukas += 5; // 13

		// skaiciukas++; // +1
		// ++skaiciukas;

		skaiciukas++;

		skaiciukas--;

		System.out.println(skaiciukas);
		System.out.println(skaiciukas);

		skaiciukas = skaiciukas - 5; // 8
		skaiciukas -= 5; // 3

		skaiciukas = skaiciukas * 2; // daugyba
		skaiciukas *= 2;

		//
		skaiciukas = skaiciukas / 2; // Sveikosios dalies dalyba
		skaiciukas /= 2;

		//
		skaiciukas = 7;
		skaiciukas = skaiciukas % 2; // 1 likucio suradimas
		skaiciukas %= 2;

		// * / % + -

		skaiciukas = 45 - (43 % ((6 * 7) / 2)) - 5;

		// Loginiai operatoriai

		// Ar lygu
		boolean reiksme2 = false;
		boolean reiksme3 = true;

		boolean reiksme1 = (skaiciukas % 8) == 3;

		// Ar nelygu
		reiksme1 = (skaiciukas % 8) != 3;

		reiksme1 = skaiciukas > 3;
		reiksme1 = skaiciukas < 3;

		reiksme1 = skaiciukas >= 3;
		reiksme1 = skaiciukas <= 3;

		// Pakeisk i priesinga
		reiksme1 = !reiksme1;
		
		// Jeigu ir vienas ir kitas yra TRUE tik tada TRUE (AND)
		reiksme1 = (skaiciukas > 3) && ((skaiciukas % 8) != 3);
		
		// Jeigu bent vienas TRUE tada TRUE (OR)
		reiksme1 = (skaiciukas > 3) || ((skaiciukas % 8) != 3);
		
		// XOR: TRUE tik tada kai nesutampa (TRUE ir FALSE => TRUE)
		reiksme1 = (skaiciukas > 3) ^ ((skaiciukas % 8) != 3);
		
		
		
		
		
		

	}

}
