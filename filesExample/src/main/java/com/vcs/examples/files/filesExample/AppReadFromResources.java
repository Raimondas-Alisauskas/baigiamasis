package com.vcs.examples.files.filesExample;

import java.io.IOException;

import org.apache.commons.io.IOUtils;

public class AppReadFromResources {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// InputStream str =
		// AppReadFromResources.class.getClassLoader().getResourceAsStream("bbb.txt");
		//
		// String result = "";
		// int data = str.read();
		// while (data != -1) {
		// data = str.read();
		// result += (char) data;
		// }
		// str.close();
		//
		// System.out.println(result);

		String text = IOUtils.toString(AppReadFromResources.class.getClassLoader().getResourceAsStream("bbb.txt"),
				"UTF-8");

		System.out.println(text);

	}

}
