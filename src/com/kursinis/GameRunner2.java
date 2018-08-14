package com.kursinis;

import java.util.ArrayList;
import java.util.List;

import com.kursinis.TrumpiausioKelioPaieska.Point;

public class GameRunner2 {


	public static void main(String[] args) {
		

		char[][] labirintas = {
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }, // x - siena
				{ 'X', 'O', 'O', 'O', 'X', 'O', 'X', 'O', 'O', 'O', 'O', 'O', 'X' }, // O - open
				{ 'X', 'O', 'X', 'O', 'O', 'O', 'X', 'O', 'X', 'X', 'X', 'O', 'X' }, // ? - pele
				{ 'X', 'O', 'O', 'O', 'X', 'X', 'X', 'O', 'O', 'O', 'O', 'O', 'X' },
				{ 'X', 'O', 'X', 'O', 'O', 'O', 'O', 'O', 'X', 'X', 'X', 'O', 'X' },
				{ 'X', 'O', 'X', 'O', 'X', 'X', 'X', 'O', 'X', 'O', 'O', 'O', 'X' },
				{ 'X', 'O', 'X', 'O', 'X', 'O', 'O', 'O', 'X', 'O', 'X', 'O', 'X' },
				{ 'X', 'O', 'X', 'O', 'X', 'X', 'X', 'O', 'X', '?', 'X', 'O', 'X' },
				{ 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'X', 'O', 'X' },
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }
		};


		for (int i = 0; i < labirintas.length; i++) {
			for (int j = 0; j < labirintas[0].length; j++) {
				if (j < labirintas[0].length - 1) {
					System.out.print(labirintas[i][j] + " ");
				} else {
					System.out.print(labirintas[i][j] + "\n");
				}
			}
		}
		
		Point cat = new Point(1, 1);
		Point mouse = new Point(7, 9);
	
		List<Point> trumpiausiasKelias = new ArrayList<>();
		trumpiausiasKelias = TrumpiausioKelioPaieskaRBFS.findShortestPath(labirintas, cat, mouse, trumpiausiasKelias);

		for (int k = 0; k < trumpiausiasKelias.size(); k++) {
			Point kx = trumpiausiasKelias.get(k);
			Point ky = trumpiausiasKelias.get(k + 1);
			System.out.print(kx + " ");
			System.out.print(ky + " ");

		}


	}

}
