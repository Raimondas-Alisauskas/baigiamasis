package com.vcs.examples.mvn.parser;

import org.apache.commons.lang3.StringUtils;

import com.vcs.examples.mvn.tests.KlaidosTipas;
import com.vcs.examples.mvn.tests.NameUniqService;
import com.vcs.examples.mvn.tests.NevalidusVardas;

public class NameParser {

	private NameUniqService service;

	public NameParser() {

	}

	public NameParser(NameUniqService service) {
		this.service = service;
	}

	public String parseUniqName(String nameAndSurname) throws NevalidusVardas {

		String name = validate(nameAndSurname);

		if (!service.checkUniq(name)) {
			return service.createUniq(name);
		}

		return name;
	}
	
	

	String validate(String nameAndSurname) throws NevalidusVardas {
		if (nameAndSurname == null) {
			throw new NevalidusVardas(KlaidosTipas.KRITINE, null);
		}

		String[] arr = nameAndSurname.split(" ");

		if (arr.length != 2) {
			throw new NevalidusVardas("Zodziu kiekis netinka: " + arr.length);
		}

		if (StringUtils.isBlank(arr[0])) {
			throw new NevalidusVardas("Siek tiek tustokas :)");
		}

		if (!StringUtils.isAlpha(arr[0])) {
			throw new NevalidusVardas(KlaidosTipas.ISPEJIMAS, arr[0]);
		}

		return arr[0];
	}

}
