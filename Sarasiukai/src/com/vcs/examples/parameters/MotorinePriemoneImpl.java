package com.vcs.examples.parameters;

public abstract class MotorinePriemoneImpl<V extends Variklis > implements MotorinePriemone<V>{
	
	private V variklis;

	public MotorinePriemoneImpl(V variklis) {
		this.variklis = variklis;
	}

	@Override
	public V getVariklis() {
		return variklis;
	}

	public void setVariklis(V variklis) {
		this.variklis = variklis;
	}
	
	public  <T> String getKazkas(T param) {
		return "";
	}
}
