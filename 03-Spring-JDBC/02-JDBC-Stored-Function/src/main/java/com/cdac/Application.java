package com.cdac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cdac.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepository repo = context.getBean(StudentRepository.class);
		
		String s = repo.getStudentGrade(105);
		
		System.out.println("Student Grade :" + s);
	}

}
