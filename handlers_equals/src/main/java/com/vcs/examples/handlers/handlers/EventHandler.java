package com.vcs.examples.handlers.handlers;

import java.util.Properties;

public interface EventHandler {

	void readProperty(String valueOfProp);

	Properties loadProp();

}
