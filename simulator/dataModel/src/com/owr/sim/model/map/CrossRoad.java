package com.owr.sim.model.map;

import java.util.List;

public class CrossRoad implements IWayElement {

	private int id;

	private List<Road> roadsOut;
	private List<Road> roadsIn;

	private TraficLight traficLight;

	public CrossRoad(int uniqId) {

	}

	@Override
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return "" + id;
	}

}
