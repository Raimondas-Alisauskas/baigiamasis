package com.vcs.examples.spring.tr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vaziuoti {

	@Autowired
	private TransportoPriemonesService trService;
	
	@Autowired
	@Qualifier("a")
	private TransportoPriemone a;
	
	@Autowired
	@Qualifier("m")
	private TransportoPriemone m;

	public void vaziuoti() {

		System.out.println();
		System.out.println(trService.getTr(true).getSound());
		System.out.println(a.getSound());
		System.out.println(m.getSound());
//		System.out.println(m.getSound());
		System.out.println();
	}

}
