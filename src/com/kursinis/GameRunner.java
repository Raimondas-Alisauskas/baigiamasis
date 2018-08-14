package com.kursinis;

import java.util.ArrayList;
import java.util.List;

public class GameRunner {



	public static void main(String[] args) {

		Map labirintas = new Map(10, 8, 1, 1, 7, 6);
		// labirintas.uzpildyti();
		int[][] uzpildytas = labirintas.uzpildyti();
		List<Integer> kelias = new ArrayList<Integer>();
		// labirintas.ieskotiKelio(uzpildytas, 1, 1, 7, 6, kelias);


	}

}