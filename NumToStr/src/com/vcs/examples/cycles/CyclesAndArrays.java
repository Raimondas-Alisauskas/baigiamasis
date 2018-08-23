package com.vcs.examples.cycles;

import java.util.Arrays;

public class CyclesAndArrays {

	@SuppressWarnings("unused")
	public void masyvai() {

		//
		String elementas = "str";

		String[] elementai1 = new String[6];
		String elementai2[] = new String[6];

		String[] skMasyvas = { "Nulis", "Vienas", "Du", "Trys", "Keturi", "Penki", "Sesi", "Septyni", "Astuoni",
				"Devyni" };

		int masyvoElementuKiekis = skMasyvas.length;

		// java.lang.String@4353456

		System.out.println(Arrays.toString(skMasyvas));

		for (int i = 0; i < skMasyvas.length; i++) {
			System.out.println(skMasyvas[i]);
		}

		int sk = 7;

		String skStr = skMasyvas[sk];

		System.out.println(skStr);

		// Multi

		int[][] matrix1 = new int[3][3];

		int[][] matrix2 = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 4, 5 }, { 7, 8, 9 }, { 1 },
				null, {} };

		matrix2[0] = new int[15];

		masyvoElementuKiekis = matrix2.length; // 6

		masyvoElementuKiekis = matrix2[0].length; // 15
		masyvoElementuKiekis = matrix2[5].length; // 0

		// CyclesAndArrays [][] d3ObjKubas = new CyclesAndArrays[2][4];

		Integer[] asdas = { 2, 4, 5, 6, 7, 4, 4334, 34, 34, 657 };

		Integer[][] dvimatisInt = { { 1, 2, 3 }, { 4, 5 }, { 7, null, 9 }, { 1 }, null, {}, asdas };
		dvimatisInt[0] = new Integer[15];

	}

	public void ciklai() {

		int sk = 3;

		// Ciklai

		// FOR
		// 0 1 2
		for (int i = 0; i < sk; i++) {
			System.out.println("sk" + (i + 1));
		}

		// 1 2 3
		for (int i = 1; i <= sk; i++) {
			System.out.println("sk" + i);
		}

		// 2 1 0
		for (int i = sk - 1; i >= 0; i--) {
			System.out.println("sk" + i);
		}

		// 3 2 1
		for (int i = sk; i > 0; i--) {
			System.out.println("sk" + i);
		}

		int[] duomenys = { 0, 34, 4, 0, 6, 4, 4 };

		// WHILE
		int i = 0;
		while (arSuradomSprendini(duomenys)) {
			i++;
			duomenys = ieskomNaujoSprendinio(i);

			// break;
			// returm;

			if (klaida(duomenys)) {
				break;
			}

		}

		// DO WHILE
		i = 0;
		do {
			i++;
			duomenys = ieskomNaujoSprendinio(i);

		} while (arSuradomSprendini(duomenys));

	}

	private boolean klaida(int[] duomenys) {
		// TODO Auto-generated method stub
		return false;
	}

	private int[] ieskomNaujoSprendinio(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean arSuradomSprendini(int[] duomenys) {
		// TODO Auto-generated method stub
		return false;
	}

}
