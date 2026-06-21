package com.asn.demo.exception;

public class DataNotFoundDBException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3121025146034815731L;

     private String errorMessage;
     private String errorCode;
     
     
	public DataNotFoundDBException(String errorMessage, String errorCode) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
