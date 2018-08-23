package com.vcs.examples.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainSet {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		Set<Person> persons = new HashSet<>();
		
		persons.add(new Person("12345", "Jonas", "Pavardenis"));
		persons.add(new Person("12346", "Benas", "Pavardenis"));
		persons.add(new Person("12347", "Jonas", "Pavardenis"));
		persons.add(new Person("12348", "Antanas", "Nelabai"));
		persons.add(new Person("12349", "Jonas", "Labai"));
		
		
		
		for (Person person : persons) {
			System.out.println(person);
		}
		
		
		//----------------------------------------------
		
		Set<String> strSet = new LinkedHashSet<>();
		
		
		
		
		
	}

}
