package com.kursinis;

public class Labirintas {

	private int[][] labirintas;

	public int[][] uzpildyti() {
		int[][] uzpildytas = labirintas;
		for (int i = 0; i < labirintas.length; i++) {
			for (int j = 0; j < labirintas[0].length; j++) {
				labirintas[i][0] = 1;
				labirintas[0][j] = 1;
				labirintas[i][labirintas[0].length - 1] = 1;
				labirintas[labirintas.length - 1][j] = 1;
				// labirintas[a][b] = 9;

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
}
