package com.vcs.examples.num;

public class NumToString {

	/**
	 * sk - 0 iki 99
	 */
	public String getString(int sk) {

		// 0..9
		// 10 20 30
		// 11... 19
		// 21... 29; 31...39...

		if (sk <= 9) {
			return from_0_9(sk);
		}

		if (isItRounded(sk)) {
			return fromRounded(sk);
		}

		if (sk >= 11 && sk <= 19) {
			return from_11_19(sk);
		}

		return from_X1_X9(sk);
	}

	private String from_X1_X9(int sk) {
		
		int minor = sk % 10;
		int major = sk - minor;
		return fromRounded(major) +" "+ from_0_9(minor);
	}

	private String from_11_19(int sk) {
		switch (sk) {
		
		case 11:
			return "vienuolika";
		case 12:
			return "dvylika";
		case 13:
			return "trylika";
		case 14:
			return "keturiolika";
		case 15:
			return "peniolika";
		case 16:
			return "sesiolika";
		case 17:
			return "septyniolika";
		case 18:
			return "astuoniolika";
		case 19:
			return "deviniolika";
		}
		
		return " :( ";
	}

	private String fromRounded(int sk) {
		switch (sk) {
		case 10:
			return "desimt";
		case 20:
			return "dvidesimt";
		case 30:
			return "trisdesimt";
		case 40:
			return "keturiasdesimt";
		case 50:
			return "penkiasdesimt";
		case 60:
			return "sesiasdesimt";
		case 70:
			return "septyniasdesimt";
		case 80:
			return "astuonesdiasimt";
		case 90:
			return "devyniasdesimt";
		}
		
		return " :( ";
	}

	private String from_0_9(int sk) {

		switch (sk) {
		case 0:
			return "nulis";
		case 1:
			return "vienas";
		case 2:
			return "du";
		case 3:
			return "trys";
		case 4:
			return "keturi";
		case 5:
			return "penki";
		case 6:
			return "sesi";
		case 7:
			return "septyni";
		case 8:
			return "astuoni";
		case 9:
			return "devyni";
		}
		
		return " :( ";
	}

	private boolean isItRounded(int sk) {
		return sk % 10 == 0;
	}

}
