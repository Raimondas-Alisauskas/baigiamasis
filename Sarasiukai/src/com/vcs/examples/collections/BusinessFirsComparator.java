package com.vcs.examples.collections;

import java.util.Comparator;

public class BusinessFirsComparator implements Comparator<ClientOfTheBank> {

	private boolean businessPriority = true;

	public BusinessFirsComparator() {

	}

	public BusinessFirsComparator(boolean businessPriority) {
		this.businessPriority = businessPriority;
	}

	@Override
	public int compare(ClientOfTheBank o1, ClientOfTheBank o2) {

		// Verslo klientas
		// Operacija
		// Pirmuma eileje

		if (o1.isBusiness() && !o2.isBusiness()) {
			return (businessPriority ? -1 : 1);
		} else if (!o1.isBusiness() && o2.isBusiness()) {
			return (businessPriority ? 1 : -1);
		}

		boolean arKortele = TypeOfService.CARDS.equals(o1.getService()) && !TypeOfService.CARDS.equals(o2.getService());
		
		if (arKortele) {
			return -1;
		} else if (!arKortele) {
			return 1;
		}

		return o1.getNb() - o2.getNb();
	}

}
