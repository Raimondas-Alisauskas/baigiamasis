package com.vcs.projects.vehicle.json.model;

public class RoadPointJson extends PointJson {

	private int speedLimit;
	private Boolean underGround;

	public int getSpeedLimit() {
		return speedLimit;
	}

	public void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
	}

	public Boolean getUnderGround() {
		return underGround;
	}

	public void setUnderGround(Boolean underGround) {
		this.underGround = underGround;
	}

}
