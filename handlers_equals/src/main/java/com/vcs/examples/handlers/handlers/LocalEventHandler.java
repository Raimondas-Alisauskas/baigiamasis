package com.vcs.examples.handlers.handlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LocalEventHandler implements EventHandler {

	@Override
	public void readProperty(String valueOfProp) {

		System.out.println("readProperty: " + valueOfProp);

	}

	@Override
	public Properties loadProp() {

		File f = new File("resources/c.properties");

		InputStream inStream = null;
		try {
			inStream = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(inStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;
	}

}
