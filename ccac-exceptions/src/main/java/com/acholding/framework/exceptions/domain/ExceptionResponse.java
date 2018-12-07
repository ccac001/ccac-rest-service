package com.acholding.framework.exceptions.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ExceptionResponse {
	
	private int statusCode;
	
	private String status;
	
	private String messageForBusiness;
	
	private String detailedMessageForBusiness;
	
	private String messageForDeveloper;
	
	private String embeddedExceptionMessage;
	
	private String embeddedExceptionStacktrace;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessageForBusiness() {
		return messageForBusiness;
	}

	public void setMessageForBusiness(String messageForBusiness) {
		this.messageForBusiness = messageForBusiness;
	}

	public String getDetailedMessageForBusiness() {
		return detailedMessageForBusiness;
	}

	public void setDetailedMessageForBusiness(String detailedMessageForBusiness) {
		this.detailedMessageForBusiness = detailedMessageForBusiness;
	}

	public String getMessageForDeveloper() {
		return messageForDeveloper;
	}

	public void setMessageForDeveloper(String messageForDeveloper) {
		this.messageForDeveloper = messageForDeveloper;
	}

	public String getEmbeddedExceptionMessage() {
		return embeddedExceptionMessage;
	}

	public void setEmbeddedExceptionMessage(String embeddedExceptionMessage) {
		this.embeddedExceptionMessage = embeddedExceptionMessage;
	}

	public String getEmbeddedExceptionStacktrace() {
		return embeddedExceptionStacktrace;
	}

	public void setEmbeddedExceptionStacktrace(String embeddedExceptionStacktrace) {
		this.embeddedExceptionStacktrace = embeddedExceptionStacktrace;
	}
}
