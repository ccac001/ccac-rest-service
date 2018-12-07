package com.acholding.framework.exceptions;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

import org.springframework.http.HttpStatus;

public class InsufficientInformationException extends GenericException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3094275954751110964L;
	
	private final HttpStatus httpStatus = BAD_REQUEST;

	public InsufficientInformationException() {
		this.setDetailedMessageForBusiness("There are no enough parameters provided to execute the operation. Please contact the administrator.");
	}

	@Override
	public HttpStatus getHttpStatus() {
		return this.httpStatus;
	}
}
