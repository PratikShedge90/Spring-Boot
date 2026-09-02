package com.tca.exceptions;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.tca.dto.ErrorDetails;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	//Handle Specific Custom Exception (ResourceNotFoundException)
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleResourceNotFoundException(
										ResourceNotFoundException re, WebRequest request)
	{
		ErrorDetails  errorDetails = new ErrorDetails(LocalDate.now(),
													re.getMessage(),
													request.getDescription(false),
													HttpStatus.NOT_FOUND.value()
													);
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND); 
	}

	// 2. Fallback for Global / Generic Exceptions
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleGlobalException(
            Exception ex, WebRequest request) {

        ErrorDetails errorDetails = new ErrorDetails(
                LocalDate.now(),
                "An unexpected error occurred: " + ex.getMessage(),
                request.getDescription(false),
                HttpStatus.INTERNAL_SERVER_ERROR.value()
        );

        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
