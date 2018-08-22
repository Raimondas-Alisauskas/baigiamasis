package com.vcs.examples.files.filesExample;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

public class AppGsonWriter {

	public static void main(String[] args) throws IOException {

		TransportoPriemone tr = new TransportoPriemone("Pavadinimas AAA");
		tr.setRatuKiekis(56);
		tr.setVariklis("engine");
		tr.setVietuKiekis(56);

		Gson gson = new Gson();
		File f = new File(TransportoPriemone.class.getSimpleName() + ".json");

		FileUtils.writeStringToFile(f, gson.toJson(tr), UTF_8, false);

	}
}
