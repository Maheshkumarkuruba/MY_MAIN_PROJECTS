package com.jsp.customexception;

public class EmployeeNotFound extends Exception{
	String message;
public EmployeeNotFound(String message) {
	this.message=message;
}
public String getMessage() {
	return message;
}
}
