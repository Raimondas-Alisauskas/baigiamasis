package com.vcs.examples.spring.tr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportoPriemonesService {

	@Autowired
	private Automobilis a;

	@Autowired
	private Motociklas m;

	public TransportoPriemone getTr(boolean auto) {

		if (auto) {
			return a;
		}

		return m;
	}

}
