package com.kursinis;

import java.util.ArrayList;
import java.util.List;

public class Map {

	private int[][] labirintas;
	private int ilgis;
	private int plotis;
	private List<Integer> kelias = new ArrayList<Integer>();
	private int x; //Katino x koordinate
	private int y;//Katino y koordinate
	private int a;//Peles x koordinate
	private int b;//Peles y koordinate

	public Map(int ilgis, int plotis, int x, int y, int a, int b) {
		this.setIlgis(ilgis);
		this.setPlotis(plotis);
		this.setX(x);
		this.setY(y);
		this.setA(a);
		this.setB(b);
		this.labirintas = new int[ilgis][plotis];

	}
	
	

	public int[][] uzpildyti() {
		int[][] uzpildytas = labirintas;
		for (int i = 0; i < labirintas.length; i++) {
			for (int j = 0; j < labirintas[0].length; j++) {
				labirintas[i][0] = 1;
				labirintas[0][j] = 1;
				labirintas[i][labirintas[0].length - 1] = 1;
				labirintas[labirintas.length - 1][j] = 1;
				labirintas[a][b] = 9;

			}
		}

		for (int i = 0; i < uzpildytas.length; i++) {
			for (int j = 0; j < uzpildytas[0].length; j++) {
				if (j < uzpildytas[0].length - 1) {
					System.out.print(uzpildytas[i][j] + " ");
				} else {
					System.out.print(uzpildytas[i][j] + "\n");
				}
			}

		}

		return uzpildytas;

	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getIlgis() {
		return ilgis;
	}

	public void setIlgis(int ilgis) {
		this.ilgis = ilgis;
	}

	public int getPlotis() {
		return plotis;
	}

	public void setPlotis(int plotis) {
		this.plotis = plotis;
	}

	public List<Integer> getKelias() {
		return kelias;
	}

	public void setKelias(List<Integer> kelias) {
		this.kelias = kelias;
	}



}
