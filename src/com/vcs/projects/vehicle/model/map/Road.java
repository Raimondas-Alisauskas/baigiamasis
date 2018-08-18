package com.vcs.projects.vehicle.model.map;

public class Road implements IWayElement {

	private int id;
	private String name;
	private RoadSection[] sections;
	private CrossRoad crossRoadIn;
	private CrossRoad crossRoadOut;

	public Road(int uniqId, String name) {
		this.id = uniqId;
		this.name = name;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	public RoadSection[] getSections() {
		return sections;
	}

	public void setSections(RoadSection[] sections) {
		this.sections = sections;
	}

	public CrossRoad getCrossRoadIn() {
		return crossRoadIn;
	}

	public void setCrossRoadIn(CrossRoad crossRoadIn) {
		this.crossRoadIn = crossRoadIn;
	}

	public CrossRoad getCrossRoadOut() {
		return crossRoadOut;
	}

	public void setCrossRoadOut(CrossRoad crossRoadOut) {
		this.crossRoadOut = crossRoadOut;
	}

}
