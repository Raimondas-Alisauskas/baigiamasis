package com.vcs.examples.files.filesExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppProperties {

	public static void main(String[] args) throws IOException {

		File f = new File("resources/config.properties");

		InputStream inStream = new FileInputStream(f);

		Properties prop = new Properties();

		prop.load(inStream);

		System.out.println(prop.getProperty(ConfigKeys.mano_programa_parametras2.toString()));

		int sk = Integer.valueOf(prop.getProperty(ConfigKeys.mano_programa_parametras3.toString(), "0"));

		System.out.println("va: " + (sk + 3));

		getMonthLt("k", prop);

		// <properties.key.name=?>

	}

	private static void getMonthLt(String linksinis, Properties prop) {
		for (int i = 0; i < 2; i++) {
			System.out.println(prop.getProperty("month_" + linksinis + "_" + i));
		}
	}

}
