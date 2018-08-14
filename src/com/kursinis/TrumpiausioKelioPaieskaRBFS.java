package com.kursinis;

import java.util.List;

public class TrumpiausioKelioPaieskaRBFS {

	public class Point {

		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static final char OPEN = 'O';
	static final char WALL = 'X';
	static final boolean VISITED = true;

	private boolean[][] visited;
	private char[][] labirintas;
	private Point cat;
	private Point mouse;

	public TrumpiausioKelioPaieskaRBFS(char[][] labirintas, Point cat, Point mouse) {

		this.labirintas = labirintas;
		this.visited = new boolean[labirintas.length - 1][labirintas[0].length - 1];
		this.cat = cat;
		this.mouse = mouse;

	}


	public static List<Point> findShortestPath(char[][] labirintas, boolean[][] visited, Point cat, Point mouse,
			List<Point> ShortestPath) {

		return ShortestPath;

	}

	public static boolean isValidPoint(char[][] labirintas, int x, int y) {
		return (x >= 0) && (x <= labirintas.length) && (y >= 0) && (y <= labirintas[0].length);
	}

	public static boolean isFreePoint(char[][] labirintas, boolean[][] visited, int x, int y) {
		return (labirintas[x][y] != WALL) && (!visited[x][y]);
	}

}
