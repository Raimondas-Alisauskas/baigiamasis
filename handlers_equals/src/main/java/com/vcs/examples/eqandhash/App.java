package com.vcs.examples.eqandhash;

import java.util.HashMap;
import java.util.Map;

public class App {

	/**
	 * <ul>
	 * <li>1) Jeigu objektai pagal atributus yra equals TRUE, tada hashCode VISADA
	 * turi sutapri;</li>
	 * <li>2) Jeigu hashCode sutampa, tada equals gali buti TRUE gali buti
	 * FALSE</li>
	 * </ul>
	 */

	public static void main(String[] args) {

		Map<Spalva, String> palete = new HashMap<>();

		Spalva juoda = new Spalva("juoda", 5);

		palete.put(new Spalva("balta", 13), "WHITE");
		palete.put(juoda, "BLACK");
		palete.put(new Spalva("juoda", 5), "BLACK2");

		if ((new Spalva("balta", 20)).equals(new Spalva("balta", 30))) {
			System.out.println("Balta yra balta :)");
		}

		System.out.println(palete.get(juoda));
		System.out.println(palete.get(new Spalva("juoda", 5)));

		if (new String("abc").hashCode() == new String("abc").hashCode()) {
			System.out.println("Tiesa yra ...");
		}

	}

}
