package com.alang.business.exceptios;

public class UserException extends Exception {

	public UserException(String exceptionMessage) {
		super(exceptionMessage);
	}
	
	public String getErrorMessage()
	{
		return getMessage().toString();
	}
	
	
}
