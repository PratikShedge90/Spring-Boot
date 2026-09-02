package com.tca.runner;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Gender;
import com.tca.entity.Student;
import com.tca.service.StudentService;

@Component
public class MyRunner implements ApplicationRunner{

	private StudentService studentService;
	
	public MyRunner(StudentService studentService)
	{
		this.studentService=studentService;
	}
	
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		// Test : find By Gender
/*		
		List<Student> list = studentService.fetchByGender(Gender.MALE);
		if(!list.isEmpty())
		{
			printStudents(list);
		}
		else {
				System.out.println("No Student Found for Given Gender !");
		}
*/		
		
		// Test 2: find by Birth-date
/*		
		List<Student> list = studentService.fetchByBirthDate(LocalDate.of(2001, 05, 12));
		if(!list.isEmpty())
		{
			printStudents(list);
		}
		else {
				System.out.println("No Student Found for Given BirthDate !");
		}
*/
		
		// Test 2: find by Name of Student
/*		
		List<Student> list = studentService.fecthByName("Sakshi");
		if(!list.isEmpty())
		{
			printStudents(list);
		}
		else {
				System.out.println("No Student Found with Name to Given");
		}
*/		
		
		/***  Test Case: Find By BirthDate Greater than Given Date ***/
/*
		List<Student> list = studentService.fetchByBirthDateGreaterThan(LocalDate.of(2002, 05, 12));
		if(!list.isEmpty())
		{
			printStudents(list);
		}
		else {
				System.out.println("No Student Found for Given BirthDate !");
		}
*/

/*		
		List<Student> list = studentService.fetchByPercentageBetween(60.0,80.0);
		if(!list.isEmpty())
		{
			printStudents(list);
		}
		else {
				System.out.println("No Student Found !");
		}
		
*/
		List<Student> list = studentService.fetchFirst2ByGenderOrderByPerDesc(Gender.MALE);
		if(!list.isEmpty())
		{
			printStudents(list);
		}
		else {
				System.out.println("No Student Found !");
		}
		
		
		
		
		
	}
	
	
	
	private static void printStudents(List<Student> L)
	{
		for(Student data : L)
		{
			System.out.println(data);		
			System.out.println("-----".repeat(20));
		}
	}

}
