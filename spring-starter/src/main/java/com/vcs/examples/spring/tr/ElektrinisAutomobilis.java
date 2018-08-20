package com.vcs.examples.spring.tr;

import org.springframework.stereotype.Component;

//@Component
public class ElektrinisAutomobilis extends Automobilis {

	@Override
	public String getSound() {
		return "thuuuuu";
	}
}
