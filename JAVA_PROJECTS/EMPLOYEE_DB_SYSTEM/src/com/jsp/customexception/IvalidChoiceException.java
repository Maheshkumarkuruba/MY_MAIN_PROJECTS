package com.jsp.customexception;

public class IvalidChoiceException extends Exception{
	private String message;
public IvalidChoiceException( String message) {
	this.message=message;
}
public String getMessage() {
	return message;
}
}
