package com.vcs.examples.collections;

public class Person {

	private String ak;
	private String name;
	private String surname;

	public Person(String ak, String name, String surname) {
		this.ak = ak;
		this.name = name;
		this.surname = surname;
	}

	public String getAk() {
		return ak;
	}

	public void setAk(String ak) {
		this.ak = ak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "ak: " + ak + " name: " + name + " " + surname;
	}

}
