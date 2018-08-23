package com.vcs.examples.week;

public class Week {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavaitesDienos sd = null;

		SavaitesDienos savDiena = SavaitesDienos.KT;

		System.out.println("Dabar yra: " + savDiena);

		String str = "AS";

		sd = SavaitesDienos.valueOfSilent(str);

		SavaitesDienos[] list = SavaitesDienos.values();

		for (SavaitesDienos savaitesDienos : list) {
			System.out.println(savaitesDienos + " : " + savaitesDienos.getNameOfTheDay());
		}

	}

}
