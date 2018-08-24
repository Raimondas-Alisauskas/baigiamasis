package com.vcs.examples.handlers.handlers;

import java.util.Properties;

public class VeiklosLogika {

	public String readAbcParam(EventHandler handler) {

		Properties prop = handler.loadProp();

		String p = prop.getProperty("abc", "default");

		handler.readProperty(p);

		return p;
	}

}
