package com.vcs.examples.transport;

public class Traleris extends Kateris {

	public Traleris(String pavadinimas) {
		super(pavadinimas);
	}

	private boolean gerve;

	public boolean isGerve() {
		return gerve;
	}

	public void setGerve(boolean gerve) {
		this.gerve = gerve;
	}

}
