package com.wipro.CartService.Exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class GlobalExceptionHandller {

	@ExceptionHandler({ItemExistsException.class})
	public String itemExists(ItemExistsException exception){
		return exception.getMessage();
	}
}
