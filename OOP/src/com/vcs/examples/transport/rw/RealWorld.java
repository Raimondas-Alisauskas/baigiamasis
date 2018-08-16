package com.vcs.examples.transport.rw;

import com.vcs.examples.transport.Dviratis;
import com.vcs.examples.transport.ElektrinisDviratis;
import com.vcs.examples.transport.Kateris;
import com.vcs.examples.transport.Keltas;
import com.vcs.examples.transport.Traleris;
import com.vcs.examples.transport.TransportoPriemone;

public class RealWorld {

	public static void main(String[] args) {
		RealWorld world = new RealWorld();
		
		TransportoPriemone tr = world.atvykstantiTransportoPriemone();
		
		if (TransportoPriemone.ENGINE_NONE.equalsIgnoreCase(tr.getVariklis())) {
			System.out.println("Zalioji transporto proiemone :) ");
		}
		
		if (tr instanceof Keltas) {
			System.out.println("Trapu kiekis " + ((Keltas) tr).getTrapuKiekis());
			System.out.println("Prop kiekis " + ((Kateris) tr).getPropeleriuKiekis() );
		}
		
		if (tr instanceof Kateris) {
			System.out.println("Prop kiekis " + ((Kateris) tr).getPropeleriuKiekis() );
		}
		
		if (tr instanceof Dviratis) {
			System.out.println("Labai megstu dviracius :)");
		}
		
		System.out.println(tr.getPavadinimas());
		System.out.println(tr.getVietuKiekis());
		System.out.println(tr.getVariklis());
		System.out.println(tr.getRatuKiekis());
	}

	private TransportoPriemone atvykstantiTransportoPriemone() {
		
//		Traleris tr = new Traleris();
//		tr.setPavadinimas("Tralukas SB:56444");
//		return tr;
		
		ElektrinisDviratis dv = new ElektrinisDviratis();
		
		dv.vaziuoti();
		
		
		return dv;
		
//		Kateris k = new Keltas();
//		k.setRatuKiekis(6);
//		k.setTipas("Vytis");
//		k.setVariklis("honda xr 1000");
//		k.setVietuKiekis(1);
//		
//		((Keltas) k).setTrapuKiekis(2);
//		
//		Keltas keltas = (Keltas) k;
//		keltas.setTrapuKiekis(2);
//		
//		return keltas;
	}

}
