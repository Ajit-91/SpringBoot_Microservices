package com.example.LearnSpring.util;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalAdvice {
	
	@ExceptionHandler(CustomException.class)
	public ResponseEntity<String> customError(CustomException ex){
		return ResponseEntity.status(ex.getStatus()).body(ex.getMessage());
	}
	
}
