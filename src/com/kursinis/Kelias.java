package com.kursinis;

import java.util.List;

public class Kelias {

	static final char OPEN = 'O';
	static final char SIENA = 'X';
	static final char APLANKYTA = 'Z';
	static final char PELE = '?';

	public static boolean ieskotiKelio(char[][] labirintas, int x, int y, int a, int b, List<Integer> kelias) {

		if (labirintas[x][y] == PELE) {
			kelias.add(x);
			kelias.add(y);
			return true;

		}

		if (labirintas[x][y] == OPEN) {
			labirintas[x][y] = APLANKYTA;

			int m = 0;
			int n = -1;
			if (ieskotiKelio(labirintas, x + m, y + n, a, b, kelias)) {
				kelias.add(x);
				kelias.add(y);
				return true;
			}

			m = 0;
			n = 1;
			if (ieskotiKelio(labirintas, x + m, y + n, a, b, kelias)) {
				kelias.add(x);
				kelias.add(y);
				return true;
			}

			m = -1;
			n = 0;
			if (ieskotiKelio(labirintas, x + m, y + n, a, b, kelias)) {
				kelias.add(x);
				kelias.add(y);
				return true;
			}

			m = 1;
			n = 0;
			if (ieskotiKelio(labirintas, x + m, y + n, a, b, kelias)) {
				kelias.add(x);
				kelias.add(y);
				return true;
			}

		}

		return false;
	}

}
