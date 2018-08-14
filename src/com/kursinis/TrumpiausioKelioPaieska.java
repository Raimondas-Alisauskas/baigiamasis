/*package com.kursinis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TrumpiausioKelioPaieska {

	public class Point {

		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	static final char OPEN = 'O';
	static final char SIENA = 'X';
	static final boolean APLANKYTA = true;


	private static char[][] labirintas;
	private static Point katinas;
	private static Point pele;
	private static boolean[][] visited;


	private TrumpiausioKelioPaieska(final char[][] labirintas, final Point katinas, final Point pele) {

		this.labirintas = labirintas;
		this.katinas = katinas;
		this.pele = pele;



		this.visited = new boolean[labirintas.length + 1][labirintas[0].length + 1];
	}



	public static List<Point> rastiKelia(char[][] labirintas, Point katinas, Point pele) {

		Queue<Point> galimasKelias = new LinkedList<>();
		visited[katinas.x][katinas.y] = APLANKYTA;
		galimasKelias.add(katinas);

		while (!galimasKelias.isEmpty()) {

			Point dabartinisPoint = galimasKelias.remove();

			if (dabartinisPoint.equals(pele)) {
				return (List<Point>) dabartinisPoint; // formuotiKelia()
			}

			for (Point kaimynas : getKaimynuSarasas(dabartinisPoint)) {
				if ((isValidPoint(labirintas, visited, kaimynas.x, kaimynas.y))) {
					visited[kaimynas.x][kaimynas.y] = APLANKYTA;
					galimasKelias.add(kaimynas);
				}
			}
		}
		return null;
	}

	private static List<Point> getKaimynuSarasas(Point dabartinisPoint) {

		Point up = new Point(dabartinisPoint.x - 1, dabartinisPoint.y);
		Point down = new Point(dabartinisPoint.x + 1, dabartinisPoint.y);
		Point toLeft = new Point(dabartinisPoint.x, dabartinisPoint.y - 1);
		Point toRight = new Point(dabartinisPoint.x, dabartinisPoint.y + 1);

		List<Point> kaimynuSarasas = new ArrayList<>(4);

		if (labirintas[up.x][up.y] == OPEN && visited[up.x][up.y] == APLANKYTA) { // && !APLANKYTA kodel netiko taip?
			kaimynuSarasas.add(up);
		}

		if (labirintas[down.x][down.y] == OPEN && visited[down.x][down.y] != APLANKYTA) {
			kaimynuSarasas.add(down);
		}

		if (labirintas[toLeft.x][toLeft.y] == OPEN && visited[toLeft.x][toLeft.y] != APLANKYTA) {
			kaimynuSarasas.add(toLeft);
		}

		if (labirintas[toRight.x][toRight.y] == OPEN && visited[toRight.x][toRight.y] != APLANKYTA) {
			kaimynuSarasas.add(toRight);
		}

		return kaimynuSarasas;
	}

	private static List<Point> formuotiKelia() {
		Point dabartinisPoint = pele;
		List<Point> trumpiausiasKelias = new ArrayList<>();

		while (dabartinisPoint != null) {
			trumpiausiasKelias.add(dabartinisPoint);


		}

		Collections.reverse(trumpiausiasKelias);

		return trumpiausiasKelias;
	}

	private static boolean isValidPoint(char[][] labirintas, boolean[][] visited, int x, int y) {
		return (x >= 0) && (x <= labirintas.length) && (y >= 0) && (y <= labirintas[0].length)
				&& (labirintas[x][y] != SIENA) && (!visited[x][y]);

	}

}
*/