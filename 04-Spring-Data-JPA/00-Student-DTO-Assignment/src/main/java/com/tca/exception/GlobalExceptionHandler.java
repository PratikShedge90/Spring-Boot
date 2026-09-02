package com.tca.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tca.dto.ExceptionResponseDTO;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler 
{
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<ExceptionResponseDTO> handleRuntimeException(RuntimeException re,
			 HttpServletRequest request)
	{	
		ExceptionResponseDTO exceptionResponse = new ExceptionResponseDTO();
		exceptionResponse.setTimestamp(LocalDateTime.now());
		exceptionResponse.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		exceptionResponse.setError(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
		exceptionResponse.setMesssage(re.getMessage());
		exceptionResponse.setPath(request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(exceptionResponse);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionResponseDTO> handleGenericException(
			Exception e, HttpServletRequest request)
	{
		ExceptionResponseDTO exceptionResponse = new ExceptionResponseDTO();
		exceptionResponse.setTimestamp(LocalDateTime.now());
		exceptionResponse.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		exceptionResponse.setError(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
		exceptionResponse.setMesssage(e.getMessage());
		exceptionResponse.setPath(request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(exceptionResponse);
	}
	
	@ExceptionHandler(DuplicateResourceException.class)
	public ResponseEntity<ExceptionResponseDTO> handleDuplicateResException(
			DuplicateResourceException dre, HttpServletRequest request)
	{
		ExceptionResponseDTO exceptionResponse = new ExceptionResponseDTO();
		exceptionResponse.setTimestamp(LocalDateTime.now());
		exceptionResponse.setStatusCode(HttpStatus.CONFLICT.value());
		exceptionResponse.setError(HttpStatus.CONFLICT.getReasonPhrase());
		exceptionResponse.setMesssage(dre.getMessage());
		exceptionResponse.setPath(request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.CONFLICT).body(exceptionResponse);
	}
}
