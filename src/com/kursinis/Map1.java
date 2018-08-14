package com.kursinis;

public class Map1 {

	private int[][] labirintas;
	private int x;
	private int y;
	private int a;
	private int b;

	public Map1(Map1 labirintas, int x, int y, int a, int b) {
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;

	}

	public int[][] getLabirintas() {
		return labirintas;
	}

	public void setLabirintas(int[][] labirintas) {
		this.labirintas = labirintas;
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

}
