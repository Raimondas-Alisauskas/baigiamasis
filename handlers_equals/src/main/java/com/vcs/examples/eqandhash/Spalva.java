package com.vcs.examples.eqandhash;

public class Spalva {

	private String spalva;

	private int sk;

	public Spalva(String spalva, int sk) {
		this.spalva = spalva;
		this.sk = sk;
	}

	public Spalva(String spalva) {
		this.spalva = spalva;
		this.sk = 0;
	}

	public String getSpalva() {
		return spalva;
	}

	public void setSpalva(String spalva) {
		this.spalva = spalva;
	}

	@Override
	public String toString() {
		return spalva + " " + sk;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Spalva))
			return false;
		if (obj == this)
			return true;

		boolean eq = spalva.equals(((Spalva) obj).spalva);
		eq = eq && (sk == ((Spalva) obj).sk);

		return eq;
	}

	@Override
	public int hashCode() {
		return sk - spalva.hashCode();
	}

}
