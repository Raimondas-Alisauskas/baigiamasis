package com.vcs.examples.files.filesExample;

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
public class AppTextPlain {
	public static void main(String[] args) throws IOException {
		
		
//		AppTextPlain.class.getResourceAsStream(name);

		File f = new File("aaa.txt");

		if (f.exists()) {

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
}
