package com.acholding.framework.exceptions;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

import org.springframework.http.HttpStatus;

public class InvalidJsonStructureException extends GenericException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3709247405114701824L;
	
	private final HttpStatus httpStatus = BAD_REQUEST;
	
	public InvalidJsonStructureException() {
		this.setMessageForBusiness("The entered JSON has an invalid structure.");
	}
	
	@Override
	public HttpStatus getHttpStatus() {
		return this.httpStatus;
	}
}
