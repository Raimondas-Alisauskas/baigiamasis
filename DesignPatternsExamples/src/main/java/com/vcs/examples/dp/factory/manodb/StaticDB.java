package com.vcs.examples.dp.factory.manodb;

public class StaticDB implements ManoDB {

	private static String duomenys = "";

	/**
	 * Use factory instead
	 */
	StaticDB() {

	}

	public void write(String data) {
		duomenys = data;
	}

	public String read() {
		return duomenys;
	}

}
