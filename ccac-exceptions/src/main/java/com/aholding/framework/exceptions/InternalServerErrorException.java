package com.aholding.framework.exceptions;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import org.springframework.http.HttpStatus;

public class InternalServerErrorException extends GenericException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2305595279174042944L;
	
	private final HttpStatus httpStatus = INTERNAL_SERVER_ERROR;
	
	public InternalServerErrorException() {
		this.setMessageForBusiness("An error occured in the server. Please contact the administrator.");
	}
	
	@Override
	public HttpStatus getHttpStatus() {
		return this.httpStatus;
	}
}
