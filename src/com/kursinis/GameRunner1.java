package com.kursinis;

import java.util.ArrayList;
import java.util.List;

public class GameRunner1 {


	public static void main(String[] args) {
		

		char[][] labirintas = { { 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }, // x - siena
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

		List<Integer> kelias = new ArrayList<Integer>();
		System.out.println(Kelias.ieskotiKelio(labirintas, 1, 1, 8, 10, kelias));

		for (int k = 0; k < kelias.size(); k += 2) {
			int kx = kelias.get(k);
			int ky = kelias.get(k + 1);
			System.out.print(kx + " ");
			System.out.print(ky + " ");

		}


	}

}
