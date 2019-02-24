package co.com.ceiba.phman.infraestructure.spring.http.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import co.com.ceiba.phman.domain.exceptions.NotSaveModelException;
import co.com.ceiba.phman.domain.exceptions.ViolatedValidationException;
import co.com.ceiba.phman.domain.models.ErrorResponse;


@ControllerAdvice
public class ErrorHandleController {

	@ExceptionHandler(NotSaveModelException.class)
	public <T extends NotSaveModelException> ErrorResponse handleException(T ex,  WebRequest request){
		return new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage(), request.getDescription(false));		
	}
	
	@ExceptionHandler(ViolatedValidationException.class)
	public <T extends ViolatedValidationException> ErrorResponse handleException(T ex,  WebRequest request){
		return new ErrorResponse(HttpStatus.NOT_ACCEPTABLE.value(), ex.getMessage(), request.getDescription(false));	
	}
}
