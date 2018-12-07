package com.acholding.framework.exceptions;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

import org.springframework.http.HttpStatus;

public class InvalidRequestParamsException extends GenericException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8043441522277567767L;
	
	private final HttpStatus httpStatus = BAD_REQUEST;
	
	public InvalidRequestParamsException() {
		this.setMessageForBusiness("Couldn't perform the request because it sent invalid parameters.");
	}
	
	@Override
	public HttpStatus getHttpStatus() {
		return this.httpStatus;
	}
}
