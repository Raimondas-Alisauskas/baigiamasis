package com.vcs.examples.parameters;

public class Run {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

//		MotorinePriemone<DyzelinisVariklis> va = new ValtisTDI<DyzelinisVariklis>(new DyzelinisVariklis());
//
//		MotorinePriemone<ElektrinisVariklis> a1 = new Automobilis<ElektrinisVariklis>(new ElektrinisVariklis());
//		MotorinePriemone<DyzelinisVariklis> a2 = new Automobilis<DyzelinisVariklis>(new DyzelinisVariklis());
//
//		ElektrinisVariklis v = a1.getVariklis();
//
//		List<String> str = new ArrayList<String>();
//
//		// a1.setVariklis(new DyzelinisVariklis());
//
//		auto(a1);
//		auto(a2);

		
		MotorinePriemone<DyzelinisVariklis> v = new ValtisTDI();
		MotorinePriemone<ElektrinisVariklis> vv = new Automobilis(new ElektrinisVariklis());
		
	}

	public static void auto(MotorinePriemone<? extends Variklis> a) {
		a.getVariklis();
	}

}
