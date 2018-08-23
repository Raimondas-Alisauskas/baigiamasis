package com.vcs.examples.dataDAO;

public class VadybinikoUzduotis extends LoadSave {

	// Inner
	private class Point {
		@SuppressWarnings("unused")
		int x, y;

	}

	@Override
	public void commitReport(int id, Uzduotis uz, Ataskaita at) {

		Point p = new Point();

		p.x = 10;
		p.y = 45;

		System.out.println("Keiciamas statusas: " + uz);

	}

	@Override
	public String getCode() {
		// TODO Auto-generated method stub
		return null;
	}

}
