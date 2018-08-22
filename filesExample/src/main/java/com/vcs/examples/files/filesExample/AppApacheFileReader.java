package com.vcs.examples.files.filesExample;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class AppApacheFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("aaa.txt");

		List<String> lines = FileUtils.readLines(f, java.nio.charset.StandardCharsets.UTF_8);
		for (String line : lines) {
			System.out.println(line);
		}

	}

}
