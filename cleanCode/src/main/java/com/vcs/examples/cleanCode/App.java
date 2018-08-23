package com.vcs.examples.cleanCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

/**
 * Hello world!
 *
 */
public class App {

	/**
	 * - Klase turi buti atsakinga uz konkrecia dali programos funkcionaluma.
	 * 		- Ar galit suteikti tikslu pavadinima klasei? Ar tas pavadinimas aprepia visa funkcionaluma?
	 * - Metodas turi daryti tik viena dalyką (žingsnį) ir jį turi daryti gerai.
	 * 		- Metodai trumpi ir su aiskiu pavadinimu.
	 * 
	 * - Pavadinimai:
	 * 		- Kuo platesnis scope - tuo taiklesnis ir geriau apgalvotas pavadinimas
	 * 		- Vengti bendriniu ir abstrakciu pavadinimu
	 * 		- List<Person> persons; for(Person person / p  : persons) {...}
	 * 		- Pavaidinimas turi atitikti turini!
	 * 
	 * 1) Blogas kodas daro per daug! Geras - konkrečiai ir glaustai.
	 * 2) Kartojimasis:mekartokim pavadinimuose pavadinimu kas ir taip aisku: Perseon.getPersonName() => Person.getName()
	 * 3) Palikti galimybe koda plesti kitiems
	 * 4) Dependencies - pasverti ar tikrai reikia visu, kiek jie gyvuos
	 * 5) Kodas turetu buti kiek imanoma trumpesnis ir lakoniskesnis.
	 * 6) Kas tas clean code: Clean code is a code that is written by someone who cares
	 * 
	 * 
	 * SOLID
	 *  Single responsibility principle
	 *  Open/closed principle
	 *  Liskov substitution principle
	 *  Interface segregation principle
	 *  Dependency inversion principle
	 * 
	 * */
	
	public static void main(String[] args) throws IOException {

		File f = new File("aaa.txt");

		if (f.exists()) {
			doItWithExistingFile(f);
			
		} else {

			if (f.createNewFile()) {
				System.out.println("Sukure: " + f.getAbsolutePath());
			} else {
				System.out.println("Egzistuoja: " + f.getAbsolutePath());
			}

			FileWriter fw = new FileWriter(f, true);
			fw.write("Viso gero :)");
			fw.flush();
			fw.close();

		}

	}

	private static void doItWithExistingFile(File f) throws IOException {
		Reader reader = new FileReader(f);
		BufferedReader buffReader = new BufferedReader(reader);
		String line = buffReader.readLine();

		System.out.println("Failo turinys:");

		int counter = 0;
		while (null != line && !line.isEmpty()) {
			System.out.println("" + ++counter + " ) " + line);
			line = buffReader.readLine();
		}
		buffReader.close();

		System.out.println("Pabaiga");

	}

}
