package com.asn.demo.exception;

public class ControllerException extends RuntimeException{
	
	private String errorMessage;
	private String errorcode;
	
	
	public ControllerException(String errorMessage, String errorcode) {
		super();
		this.errorMessage = errorMessage;
		this.errorcode = errorcode;
	}
	public ControllerException() {
		
	}
	
	public ControllerException(String message) {
		super();
		this.errorMessage = errorMessage;
	}
	public String getMessage() {
		return errorMessage;
	}
	public void setMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}

}
