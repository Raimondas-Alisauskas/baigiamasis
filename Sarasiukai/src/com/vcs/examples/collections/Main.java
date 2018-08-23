package com.vcs.examples.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String... a) {

		// Apribojimai:
		// Negalim naudoti su primitives'ais

		// List - Interface'as
		List<String> strList = new ArrayList<>();

		strList.add("1");
		strList.add("2");
		strList.add("3");

		// outList(strList);

		List<String> strList2 = new ArrayList<>();

		strList2.add("Vienas");
		strList2.add(strList.remove(1));
		strList2.add("TRYS");

		// outList(strList2);

		// Pridedam kita list'a i strList vidu, prijungiam prie gale esanciu reiksmiu
		strList.addAll(strList2);

		// Saraso dydis
		int size = strList.size();

		if (strList.contains("2")) {
			// Jei sarase yra tokia treiksme "2", IF'as suveiks
		}

		// Istraukia elemta: su masyvais budavo sitaip: mastvas[3]
		String elementas = strList.get(3);

		// outList(strList);

		// Ismesim pagal objekto reference'a
		strList.remove("2");

		System.out.println();

		outList(strList);
		System.out.println();
		outList(strList2);

		if (strList.removeAll(strList2)) {
			System.out.println("Ismetem reiksmiu");
		}

		outList(strList);

		if (strList.isEmpty()) {
			/// :(
		}

		// ----------------------------------------------

		List<ManoKlase> klases = new ArrayList<>();

		klases.add(new ManoKlase());
		klases.add(new ManoKlase2());
		// klases.add(3);

		// String

		StringBuilder b = new StringBuilder();
		StringBuffer sb = new StringBuffer();

		sb.append("asdad");
		sb.append("2");
		sb.append("3");

		sb.toString();

		// ----------------------------------------------
		
		// LinkedList
		
		/**
		 * ArrayList - greitas iteravimas, reiksmiu paieska (pagal indeksa). Letas pridejimas
		 * LinkedList - greitas reiksmiu pridejimas, letas iteravimas
		 * */
		List<Person> persons = new LinkedList<>();
		persons.add(new Person("", "", "") );
		
		

		// Set

		// Comparator

		// Paramaetrizuotos klasiu

	}

	private static void outList(List<String> listOfStrings) {
		for (String string : listOfStrings) {
			System.out.println("List element: " + string);
		}
	}

}
