package com.vcs.examples.dp.factory.manodb;

public class ManoDBFactory {

	private static ManoDB dbInstance = null;

	public static ManoDB getInstance() {

		if (dbInstance == null) {
			dbInstance = creteInstance();
		}

		return dbInstance;
	}

	private static ManoDB creteInstance() {
		// Is config'o
		int mode = 0;

		switch (mode) {
		case 0:
			return new StaticDB();
		case 1:
			return new SqlDB();
		default:
			break;
		}
		throw new RuntimeException("Not exists");
	}

}
