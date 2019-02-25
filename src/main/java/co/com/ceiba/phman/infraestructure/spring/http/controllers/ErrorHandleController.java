package co.com.ceiba.phman.infraestructure.spring.http.controllers;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import co.com.ceiba.phman.domain.exceptions.NotSaveModelException;
import co.com.ceiba.phman.domain.models.ErrorResponse;


@ControllerAdvice
public class ErrorHandleController extends ResponseEntityExceptionHandler{

	@ExceptionHandler(NotSaveModelException.class)
	public <T extends NotSaveModelException> ErrorResponse handleException(T ex,  WebRequest request){
		return new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage(), request.getDescription(false));		
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		StringBuilder sb = new StringBuilder();
		ex.getBindingResult()
			.getAllErrors()
			.stream()
			.map(err -> ((FieldError)err))
			.forEach(error -> {
				sb.append("{ ");
				sb.append(error.getField());
				sb.append(" : ");
				sb.append(error.getDefaultMessage());
				sb.append("}, ");
			});
		return new ResponseEntity<>(new ErrorResponse(HttpStatus.BAD_REQUEST.value(), sb.toString(), "frfrf"), status);
	}
	
	
}
