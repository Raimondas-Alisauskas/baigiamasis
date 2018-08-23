package com.vcs.examples.dataDAO;

public class Ofisas {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DarbuotojoUzduotis su = new SpecialistoUzduotis();
		Uzduotis uz = su.load(123123);

		AtaskaitosSkelbimas topSectret = (AtaskaitosSkelbimas) su;

		topSectret.paskelbtiViesaiAtaskaita(436543);

		su.commitReport(32424, uz, new Ataskaita());

		DarbuotojoUzduotis dd = new LoadSave() {

			@Override
			public String getCode() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void commitReport(int id, Uzduotis uz, Ataskaita at) {
				// TODO Auto-generated method stub

			}
		};


	}

}
