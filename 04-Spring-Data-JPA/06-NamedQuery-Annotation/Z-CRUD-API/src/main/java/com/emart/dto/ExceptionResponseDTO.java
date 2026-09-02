package com.emart.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExceptionResponseDTO 
{
	private LocalDateTime timestamp;
	private int statusCode;
	private String Error;
	private String messsage;
	private String path;
	

}
