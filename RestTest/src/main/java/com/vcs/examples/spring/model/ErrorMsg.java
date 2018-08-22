package com.vcs.examples.spring.model;

public class ErrorMsg {

	private String message;
	private String exception;

	public ErrorMsg() {

	}

	public ErrorMsg(String message, String exception) {
		this.message = message;
		this.exception = exception;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

}
