package com.emart.entity;

import java.time.LocalDateTime;

import org.hibernate.type.NumericBooleanConverter;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="student_crud")
public class Student 
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;   // Auto_Increment how to do in Spring DATA JPA
	private Integer rno;
	private String name;
	private Integer age;
	private String email;
	private String subject;
	
	@Convert(converter = NumericBooleanConverter.class)
	private Boolean deleted;
	
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
