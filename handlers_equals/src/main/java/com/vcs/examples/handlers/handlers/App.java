package com.vcs.examples.handlers.handlers;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {

		VeiklosLogika vl = new VeiklosLogika();

		String result = vl.readAbcParam(new LocalEventHandler());
		System.out.println("LOCAL: " + result);

		result = vl.readAbcParam(new TestEventHandler());
		System.out.println("TEST: " + result);

	}
}
