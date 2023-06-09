package com.masai.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(TaskException.class)
	public ResponseEntity<MyErrorDetails>taskExceptionHandler(TaskException err,WebRequest req){
		
		
		MyErrorDetails ed=new MyErrorDetails(req.getDescription(false),err.getMessage(),LocalDateTime.now());
		
		return new ResponseEntity<MyErrorDetails>(ed,HttpStatus.BAD_REQUEST);
		
		
	}
}
