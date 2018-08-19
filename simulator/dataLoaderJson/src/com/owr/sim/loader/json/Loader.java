package com.owr.sim.loader.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import com.google.gson.Gson;
import com.owr.sim.model.json.MapJson;
import com.owr.sim.model.map.RoadsMap;

public class Loader {

	public RoadsMap loader(String mapName) {

		MapJson loadedData = readMap(mapName);

		validate(loadedData);

		return linkToRoadMap(loadedData);
	}

	private RoadsMap linkToRoadMap(MapJson loadedData) {
		// TODO Auto-generated method stub
		return null;
	}

	private void validate(MapJson loadedData) {
		// TODO Auto-generated method stub
		
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
