package com.vcs.examples.collections;

import static com.vcs.examples.collections.TypeOfService.CARDS;
import static com.vcs.examples.collections.TypeOfService.CASH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMemebers {

	public static void main(String[] args) {

		List<ClientOfTheBank> clients = new ArrayList<>();

		clients.add(new ClientOfTheBank(CARDS));
		clients.add(new ClientOfTheBank(CASH));
		clients.add(new ClientOfTheBank(CARDS));
		clients.add(new ClientOfTheBank(CARDS));
		clients.add(new ClientOfTheBank(CARDS));
		clients.add(new ClientOfTheBank(CARDS));
		clients.add(new ClientOfTheBank(CARDS));
		clients.add(new ClientOfTheBank(CASH));
		clients.add(new ClientOfTheBank(CARDS));
		clients.add(new ClientOfTheBank(CASH));

		clients.add(clients.remove(2));

		for (ClientOfTheBank client : clients) {
			System.out.println(client);
		}

		System.out.println();

		Collections.sort(clients);

		// Banko darbuotojas spaudzia mygtuka "kitas klientas"
		for (ClientOfTheBank client : clients) {
			System.out.println(client);
		}

		// --------------------- Natural ordering
		List<Integer> skiaciai = new ArrayList<>();
		skiaciai.add(45);
		skiaciai.add(33);
		// skiaciai.add(null);
		skiaciai.add(1);

		Collections.sort(skiaciai);

		// for (Integer sk : skiaciai) {
		// System.out.println(sk);
		// }
		// -------------------------------------------

		System.out.println();

		clients = new ArrayList<>();

		clients.add(new ClientOfTheBank(CARDS, true));
		clients.add(new ClientOfTheBank(CASH, true));
		clients.add(new ClientOfTheBank(CARDS, false));
		clients.add(new ClientOfTheBank(CARDS, false));
		clients.add(new ClientOfTheBank(CARDS, false));
		clients.add(new ClientOfTheBank(CARDS, true));
		clients.add(new ClientOfTheBank(CARDS, false));
		clients.add(new ClientOfTheBank(CASH, false));
		clients.add(new ClientOfTheBank(CARDS, false));
		clients.add(new ClientOfTheBank(CASH, true));

		Collections.sort(clients, new BusinessFirsComparator());

		// Banko darbuotojas spaudzia mygtuka "kitas klientas"
		for (ClientOfTheBank client : clients) {
			System.out.println(client);
		}
		
		System.out.println();
		
		Collections.sort(clients, new BusinessFirsComparator(false));

		// Banko darbuotojas spaudzia mygtuka "kitas klientas"
		for (ClientOfTheBank client : clients) {
			System.out.println(client);
		}

	}

}
