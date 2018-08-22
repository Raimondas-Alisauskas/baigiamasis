package com.vcs.examples.dp.factory;

import com.vcs.examples.dp.factory.manodb.ManoDB;
import com.vcs.examples.dp.factory.manodb.ManoDBFactory;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		App app = new App();

		app.workWithDB();

	}

	public void workWithDB() {

		ManoDB dbResource = ManoDBFactory.getInstance();

		dbResource.write("duomenys");
		String duomenys = dbResource.read();

	}

	public void workWithData() {

		ManoDB dbResource =  ManoDBFactory.getInstance();

		dbResource.write("duomenys");
		dbResource.write("sfsdfsf");

	}

}
