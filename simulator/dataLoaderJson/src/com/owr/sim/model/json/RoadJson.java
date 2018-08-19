package com.owr.sim.model.json;

import java.util.List;

public class RoadJson {

	private String id;
	private String name;
	private List<RoadPointJson> points;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<RoadPointJson> getPoints() {
		return points;
	}

	public void setPoints(List<RoadPointJson> points) {
		this.points = points;
	}

}
