package com.vcs.examples.collections;

public class ClientOfTheBank implements Comparable<ClientOfTheBank> {

	private static int counter = 0;

	private boolean business;
	private int nb;
	private TypeOfService service;

	public ClientOfTheBank(TypeOfService service) {
		this(service, false);
	}
	
	public ClientOfTheBank(TypeOfService service, boolean business) {
		counter++;
		this.business = business;
		this.nb = counter;
		this.service = service;
	}

	public boolean isBusiness() {
		return business;
	}

	public void setBusiness(boolean business) {
		this.business = business;
	}

	public int getNb() {
		return nb;
	}

	public void setNb(int nb) {
		this.nb = nb;
	}

	public TypeOfService getService() {
		return service;
	}

	public void setService(TypeOfService service) {
		this.service = service;
	}

	@Override
	public int compareTo(ClientOfTheBank o) {

		// Operacija
		// Pirmuma eileje

		if (TypeOfService.CARDS.equals(service) && !TypeOfService.CARDS.equals(o.service)) {
			return -1;
		}

		return nb - o.nb;
	}

	@Override
	public String toString() {
		return "" + nb + ") " + service + " - " + (business ? "Verslo" : "Fizinis") + " klientas";
	}

}
