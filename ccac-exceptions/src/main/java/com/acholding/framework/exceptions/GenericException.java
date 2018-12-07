package com.acholding.framework.exceptions;

import static org.apache.commons.lang3.StringUtils.isEmpty;

import org.springframework.http.HttpStatus;

public abstract class GenericException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String messageForBusiness;
	
	private String detailedMessageForBusiness;

	private String messageForDev;
	
	private Exception embeddedEx;

	public String getMessageForBusiness() {
		return messageForBusiness;
	}

	protected void setMessageForBusiness(String messageForBusiness) {
		this.messageForBusiness = messageForBusiness;
	}
	
	public boolean hasMessageForBusiness() {
		if(isEmpty(this.messageForBusiness))
			return false;
		
		return true;
	}
	
	public String getDetailedMessageForBusiness() {
		return detailedMessageForBusiness;
	}

	public void setDetailedMessageForBusiness(String detailedMessageForBusiness) {
		this.detailedMessageForBusiness = detailedMessageForBusiness;
	}
	
	public boolean hasDetailedMessageForBusiness() {
		if(isEmpty(this.detailedMessageForBusiness))
			return false;
		
		return true;
	}

	public String getMessageForDev() {
		return messageForDev;
	}

	public void setMessageForDev(String messageForDev) {
		this.messageForDev = messageForDev;
	}
	
	public boolean hasMessageForDev() {
		if(isEmpty(this.messageForDev))
			return false;
		
		return true;
	}

	public Exception getEmbeddedException() {
		return embeddedEx;
	}

	public void setEmbeddedException(Exception ex) {
		this.embeddedEx = ex;
	}
	
	public boolean hasEmbeddedException() {
		if(this.embeddedEx == null)
			return false;
		
		return true;
	}
	
	public abstract HttpStatus getHttpStatus();
}
