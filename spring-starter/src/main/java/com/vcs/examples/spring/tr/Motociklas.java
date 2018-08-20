package com.vcs.examples.spring.tr;

import org.springframework.stereotype.Component;

@Component
public class Motociklas implements TransportoPriemone{

	@Override
	public String getSound() {
		return "Ziurek!!! ... ka??!";
	}

}
