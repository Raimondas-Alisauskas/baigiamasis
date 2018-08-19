package com.vcs.projects.vehicle.json.loader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import com.google.gson.Gson;
import com.vcs.projects.vehicle.json.model.MapJson;
import com.vcs.projects.vehicle.model.map.RoadsMap;

public class Loader {

	public RoadsMap loader(String mapName) {

		return null;
	}

	private MapJson readMap(String mapName) {

		File file = new File(mapName);
		Reader reader = null;
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

		Gson gson = new Gson();

		return gson.fromJson(reader, MapJson.class);

	}
}
