package com.wipro.h2crud.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

import ch.qos.logback.core.net.SocketConnector.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler({EmployeeNotFoundException.class})
	public String EmployeeNotFound(EmployeeNotFoundException e) {
		return e.getMessage();
	}
	
}
