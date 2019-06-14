package com.luv2code.springdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerApplication {

	@ExceptionHandler
	public ResponseEntity<ErrorResponseApplication> generarExceptionApp(Exception e) {
		return new ResponseEntity<>(new ErrorResponseApplication(HttpStatus.BAD_REQUEST.value(), e.getMessage(),
				System.currentTimeMillis()), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler
	public ResponseEntity<ErrorResponseApplication> customerNotFound(CustomerNotFoundException e) {
		return new ResponseEntity<>(
				new ErrorResponseApplication(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis()),
				HttpStatus.NOT_FOUND);
	}

}
