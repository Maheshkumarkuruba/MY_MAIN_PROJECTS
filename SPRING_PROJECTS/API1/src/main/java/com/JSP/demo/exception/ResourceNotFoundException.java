package com.JSP.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends  RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//public String resourceNotFound() {
//	return "";
private String resourceName;
private String FieldName;
private Object fieldValue;
public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
	super(resourceName+"not found for "+fieldName+"with value "+fieldValue);
	resourceName = resourceName;
	FieldName = fieldName;
	this.fieldValue = fieldValue;
}
public String getResourceName() {
	return resourceName;
}
public void setResourceName(String resourceName) {
	this.resourceName = resourceName;
}
public String getFieldName() {
	return FieldName;
}
public void setFieldName(String fieldName) {
	FieldName = fieldName;
}
public Object getFieldValue() {
	return fieldValue;
}
public void setFieldValue(Object fieldValue) {
	this.fieldValue = fieldValue;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}


}
