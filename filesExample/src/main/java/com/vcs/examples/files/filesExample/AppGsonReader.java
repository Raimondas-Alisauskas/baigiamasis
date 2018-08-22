package com.vcs.examples.files.filesExample;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class AppGsonReader {

	public static void main(String[] args) throws IOException {

		Reader reader = new FileReader(TransportoPriemone.class.getSimpleName() + ".json");

		Gson gson = new Gson();
		TransportoPriemone tr = gson.fromJson(reader, TransportoPriemone.class);

		System.out.println(tr.getPavadinimas());

	}
}
