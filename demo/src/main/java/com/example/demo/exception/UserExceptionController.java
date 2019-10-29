package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionController {
	
	   @ExceptionHandler(value = NotValidUserException.class)
	   public ResponseEntity<Object> exception(NotValidUserException exception) {
	      return new ResponseEntity<>("Usuario suministrado no cumple con reglas de negocio.", HttpStatus.BAD_REQUEST);
	   }

	   @ExceptionHandler(value = NotExpectedErrorException.class)
	   public ResponseEntity<Object> exception(NotExpectedErrorException exception) {
	      return new ResponseEntity<>("Ha ocurrido una excepcion durante la ejecucion del servicio. Ver Log del sistema.", HttpStatus.CONFLICT);
	   }
}
