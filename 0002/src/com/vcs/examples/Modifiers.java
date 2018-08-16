package com.vcs.examples;

public class Modifiers {
	
	
	public int viesas;
	
	int defaultinis; // tik tam paciam package'ui matomas
	
	private int privatus; // tik klases viduje
	
	protected int dalinaiPrieinamas; // tik peveldejimui
	

	
	public static final String MANO_CONST = "@";
	
	public String MANO_KITAS = "asdas";
	
	
	private String monitor = "";
	
	public static void main(String[] args) {

		//MANO_CONST = "";
		//MANO_CONST = "mano reiksme ";
		
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		//this.monitor = monitor;
		tryToChange(monitor);
	}

	private void tryToChange(String monitor2) {
		// TODO Auto-generated method stub
		
	}

	
	
}
