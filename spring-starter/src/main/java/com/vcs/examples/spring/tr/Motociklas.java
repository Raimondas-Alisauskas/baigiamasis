package com.vcs.examples.spring.tr;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("m")
public class Motociklas implements TransportoPriemone{

	@Override
	public String getSound() {
		return "Ziurek!!! ... ka??!";
	}

}
