package com.vcs.examples.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainMap {

	public static void main(String[] args) {
		// Map----------------------------------------------
		Map<Integer, String> map = new HashMap<>();

		map.put(3, "Treciadienis");
		map.put(4, "Pirmadienis");
		map.put(2, "Antradienis");
		map.put(6, "Treciadienis");
		map.put(6, "Ketvirtadiens");

		map.remove("2");

		for (Integer key : map.keySet()) {
			System.out.println("Key: " + key + " Val: " + map.get(key));
		}

		// Grazina tik reiksmes, be key'ju
		Collection<String> c = map.values();

		// Grazina keyjus lkaip Set (list'as) tipa
		Set<Integer> keys = map.keySet();

		if (map.containsKey(6)) {
			String ketvirtadienis = map.get(6);
		}

		if (map.containsValue("sad")) {

		}

		// Elementu kiekis
		map.size();

		// -----------------------------------------
		// Map'as paieskai kai nera unikalus key

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("12345", "Jonas", "Pavardenis"));
		persons.add(new Person("12346", "Benas", "Pavardenis"));
		persons.add(new Person("12347", "Jonas", "Pavardenis"));
		persons.add(new Person("12348", "Antanas", "Nelabai"));
		persons.add(new Person("12349", "Jonas", "Labai"));

		/**
		 * Paieskos pagal AK inicializavimas
		 */
		Map<String, Person> personsByAk = new HashMap<>();

		for (Person person : persons) {
			personsByAk.put(person.getAk(), person);
		}

		/**
		 * Paieska pagal AK ir isvadimas
		 */
		System.out.println(personsByAk.get("12348"));

		/**
		 * Paieskos pagal varda inicializavimas
		 */
		Map<String, List<Person>> personsByName = new HashMap<>();

		for (Person person : persons) {

			// Ar toks vardas ir jo List<> value yra?
			if (!personsByName.containsKey(person.getName())) {
				// Jei nera - itraukiam: vardas kaip key, o value kaip tuscias ArrayList()
				// nes sekancioj eilutej pridesim i ta ArrayList'a reiksme
				personsByName.put(person.getName(), new ArrayList<>());
			}
			// Cia itraukiam Person objekta pagal varda
			personsByName.get(person.getName()).add(person);

		}

		// 2,147,483,647
		// personsByName.size();

		/**
		 * Paieska ir isvedimas
		 */

		System.out.println();
		String searchName = "Jonas";
		if (personsByName.containsKey(searchName)) {
			// Atliekam paieska
			List<Person> paieskoResultatas = personsByName.get(searchName);

			// Isvedimas
			for (Person person : paieskoResultatas) {
				System.out.println(person);
			}
		}
		
		
		/// -------------------------------
		
		// LinkedHashMap
		/**
		 * HashMap - greitas iteravimas, reiksmiu paieska (pagal indeksa). Letas pridejimas
		 * LinkedHashMap - greitas reiksmiu pridejimas, letas iteravimas
		 * */
		Map<String, String> strMap = new LinkedHashMap<>();
		strMap.put("", "");
		

	}

}
