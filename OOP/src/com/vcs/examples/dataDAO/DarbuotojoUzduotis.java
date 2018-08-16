package com.vcs.examples.dataDAO;

public interface DarbuotojoUzduotis {
	
	
	
	String getCode();
	
	Uzduotis load(int id);

	void save(int id, Uzduotis uz);
	
	
	void commitReport(int id, Uzduotis uz, Ataskaita at);
	
	

}
