package com.vcs.examples.spring.tr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vaziuoti {

	@Autowired
	private TransportoPriemonesService trService;
	
	@Autowired
	private Automobilis au;
	
	@Autowired
	private Motociklas m;

	public void vaziuoti() {

		System.out.println();
		System.out.println(trService.getTr(true).getSound());
		System.out.println(au.getSound());
		System.out.println(m.getSound());
//		System.out.println(m.getSound());
		System.out.println();
	}

}
