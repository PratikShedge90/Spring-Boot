package com.tca.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponseDTO 
{
	private Long id;   // Auto_Increment how to do in Spring DATA JPA
	private Integer rno;
	private String name;
	private Integer age;
	private String email;
	private String subject;
	private String message;

}
