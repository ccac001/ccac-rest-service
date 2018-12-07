package com.acholding.framework.exceptions;

import static org.springframework.http.HttpStatus.NOT_FOUND;

import org.springframework.http.HttpStatus;

public class EntityNotFoundException extends GenericException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1802716539703594388L;
	
	private final HttpStatus httpStatus = NOT_FOUND;
	
	public EntityNotFoundException() {
		this.setMessageForBusiness("The entity requested doesn't exist in the system.");
	}

	@Override
	public HttpStatus getHttpStatus() {
		return this.httpStatus;
	}
}
