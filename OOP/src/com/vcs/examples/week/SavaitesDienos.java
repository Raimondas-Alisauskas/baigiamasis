package com.vcs.examples.week;

public enum SavaitesDienos {
	
	
	// Tik kai reikia fiksuoto dydzio reiksmiu kiekio
	// Negalim (neturetume) keisti reiksmiu runtime

	PR(0, "Pirmadienis"), AN(1, "Antradienis"), TR(2, "Treciadinis"), KT(3, "Ketvirtadienis"), PN(4,
			"Penktadinis"), ST(5, "Sestadienis"), SK(6, "Sekmadienis");

	private int i = 0;
	private String nameOfTheDay;

	private SavaitesDienos(int dienosIndex, String name) {
		i = dienosIndex;
		nameOfTheDay = name;
	}

	public int getDienosIndex() {
		return i;
	}

	public String getNameOfTheDay() {
		return nameOfTheDay;
	}

	public static SavaitesDienos valueOfSilent(String value) {

		try {
			return SavaitesDienos.valueOf(value);
		} catch (Exception e) {
			return null;
		}

	}

}
