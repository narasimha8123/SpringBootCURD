package com.asn.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpStatusCodeException;


@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<String> handleEmptyEmpoyee(BusinessException ex){
		
		return new ResponseEntity<String>("Input field is empty",HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handleEmptyInputException(EmptyInputException eix){
		return new ResponseEntity<String>(eix.getErrorMessage(),HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(DataNotFoundDBException.class)
	public ResponseEntity<String> handleEmptyInputException(DataNotFoundDBException dnfe){
		return new ResponseEntity<String>(dnfe.getErrorMessage(),HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(RequestMethodNotSupportedException.class)
	public ResponseEntity<String> handlepRequestMethodNotSupportedException(RequestMethodNotSupportedException http){
		return new ResponseEntity<String>(http.getErrorMessage(),HttpStatus.BAD_REQUEST);
	}
	
	
	
}
