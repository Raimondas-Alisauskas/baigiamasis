package com.vcs.examples.dataDAO;

public class SpecialistoUzduotis extends LoadSave {

	@Override
	public void commitReport(int id, Uzduotis uz, Ataskaita at) {
		System.out.println("Apdorojama: " + uz);
		System.out.println("Apdorojama: " + at);
	}

	@Override
	public String getCode() {
		// TODO Auto-generated method stub
		return null;
	}

}
