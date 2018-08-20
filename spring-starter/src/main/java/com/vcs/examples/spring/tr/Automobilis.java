package com.vcs.examples.spring.tr;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE )
public class Automobilis implements TransportoPriemone {

	
	private static int counter = 0;
	
	public Automobilis() {
		counter ++;
	}
	
	@Override
	public String getSound() {
		return "Brumm brumm " + counter;
	}

}
