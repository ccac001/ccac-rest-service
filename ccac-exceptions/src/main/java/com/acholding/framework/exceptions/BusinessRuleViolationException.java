package com.acholding.framework.exceptions;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

import org.springframework.http.HttpStatus;

public class BusinessRuleViolationException extends GenericException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3935623512916047237L;
	
	private final HttpStatus httpStatus = BAD_REQUEST;
	
	public BusinessRuleViolationException() {
		this.setMessageForBusiness("Cannot perform the request because there is an argument that violate one business rule.");
	}

	@Override
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
}
