package com.aholding.framework.exceptions;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import org.springframework.http.HttpStatus;

public class InconsistencyFoundException extends GenericException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8854048954162344456L;

	private final HttpStatus httpStatus = INTERNAL_SERVER_ERROR;
	
	public InconsistencyFoundException() {
		this.setMessageForBusiness("An inconsistency was discovered in the domain while the server was processing the request. Please contact the administrator.");
	}
	
	@Override
	public HttpStatus getHttpStatus() {
		return this.httpStatus;
	}
}
