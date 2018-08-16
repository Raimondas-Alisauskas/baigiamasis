package com.vcs.examples.cycles;

import java.util.Arrays;

public class ArrayOrder {

	private static final int ARR_ORDER_INDEX = 0;

	private static final int ARR_META_INDEX = 1;

	public static void main(String[] args) {

		ArrayOrder order = new ArrayOrder();

		int[][] result = order.getByOrderInt("435 345 4365 456 45 6456", false);

		for (int i = 0; i < result[ARR_ORDER_INDEX].length; i++) {

			System.out.println("index:" + i + " : " + result[ARR_ORDER_INDEX][i] + " : " + result[ARR_META_INDEX][i]);

			
			
			
		}

	}

	/**
	 * @param numbersString
	 * 
	 *            <pre>
	 *            - cia kaip PVZ:"3242 43 234234 34 234243423 234 234"
	 * 
	 *            " 3242 43 2 34234 34 234243423 234 234";
	 * 
	 *            1) duomenys gali buti nevalidus: "3 5 6A-7 5 " turetume traktuoti
	 *            kaip "3 5 5 " 2) isvesti kartu ir is skaiciu ilgius bei indeksus
	 *            </pre>
	 * 
	 * @param naturalOrder
	 *            - jeigu true: didejimo tvrka, jeigu false: mazejimo
	 * @return int tipo masyvas isrikiuotas didejimo / mazejimo tvarka
	 */
	public int[][] getByOrderInt(String numbersString, boolean naturalOrder) {

		int[] pradDuom = pradiniaiDuomenys(numbersString);

		int[] isrikiuoti = rikiuok(pradDuom);

		return paskaiciuokMeta(isrikiuoti);

	}

	private int[][] paskaiciuokMeta(int[] isrikiuoti) {

		int[][] meta = new int[2][isrikiuoti.length];

		for (int i = 0; i < isrikiuoti.length; i++) {

			// Kopijuojam reiksme
			meta[ARR_ORDER_INDEX][i] = isrikiuoti[i];

			// Paskaiciuojam meta
			meta[ARR_META_INDEX][i] = paskaiciuotiIlgi(isrikiuoti[i]);

		}

		return meta;
	}

	private int paskaiciuotiIlgi(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int[] rikiuok(int[] pradDuom) {

		int minIndex = 0;

		for (int pozicijaNuo = 0; pozicijaNuo < pradDuom.length; pozicijaNuo++) {

			minIndex = findMinIndex(pradDuom, pozicijaNuo);

			sukeisk(pradDuom, pozicijaNuo, minIndex);

		}

		return pradDuom;
	}

	private void sukeisk(int[] pradDuom, int index1, int index2) {

		int laikinaReiksme = pradDuom[index1];

		pradDuom[index1] = pradDuom[index2];

		pradDuom[index2] = laikinaReiksme;

	}

	private int findMinIndex(int[] pradDuom, int pozicijaNuo) {
		int result = 0;
		int minimaliReiksme = Integer.MAX_VALUE;

		for (int minIndex = pozicijaNuo; minIndex < pradDuom.length; minIndex++) {
			if (pradDuom[minIndex] < minimaliReiksme) {
				result = minIndex;
				minimaliReiksme = pradDuom[minIndex];
			}
		}

		return result;
	}

	private int[] pradiniaiDuomenys(String numbersString) {

		// Iskaidom
		String[] nevaliduStr = isskaidom(numbersString);

		// Nevalidziu ismetimas
		String[] validusStr = ismestiNevalidzius(nevaliduStr);

		return konvertuotiIInt(validusStr);

	}

	private int[] konvertuotiIInt(String[] validusStr) {
		// int [] => {0, 0} - sužinom kiek yra elementų
		int[] skaiciaiInt = new int[validusStr.length];

		for (int i = 0; i < validusStr.length; i++) {
			skaiciaiInt[i] = Integer.parseInt(validusStr[i]);
		}
		// String{“345”, “2"} => int{345, 2}
		return skaiciaiInt;
	}

	private String[] isskaidom(String numbersString) {
		return numbersString.split(" ");
	}

	private String[] ismestiNevalidzius(String[] skaiciaiString) {
		// TODO cia turetu buti kodas kuris ismeta nevalidzius
		// TASK: Petrui
		return skaiciaiString;
	}

}
