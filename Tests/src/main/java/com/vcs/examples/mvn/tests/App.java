package com.vcs.examples.mvn.tests;

import com.vcs.examples.mvn.parser.NameErrorHandler;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		
		// Unchecked
		NameErrorHandler f2 = new NameErrorHandler();

		String v = null;

		v = f2.getTikVardas("a z");
		
		

		System.out.println("[" + v + "]");

		// Checked

		

	}
}
