package com.restro.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.restro.exception.RestaurantNotFound;

@ControllerAdvice
public class RestaurantExceptionHandler {

	@ExceptionHandler(RestaurantNotFound.class)
	public ResponseEntity<String> handleRestaurantNotFound(RestaurantNotFound restaurantNotFound) {
		return new ResponseEntity<String>("Restaurant not found.", HttpStatus.NOT_FOUND);
	}
	
}