package com.vcs.examples.handlers.handlers;

import java.util.Properties;

public class TestEventHandler implements EventHandler {

	@Override
	public void readProperty(String valueOfProp) {

	}

	@Override
	public Properties loadProp() {

		Properties p = new Properties();
		p.setProperty("abc", "REIKSME LAIKINA");

		return p;
	}

}
