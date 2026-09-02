package com.tca.runner;

import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Gender;
import com.tca.entity.Student;
import com.tca.service.StudentService;

@Component
public class MyRunner implements ApplicationRunner {

	private final StudentService studentService;

	MyRunner(StudentService studentService) {
		this.studentService = studentService;
	}
	
	private static void printStudents(List<Student> L)
	{
		for(Student data : L)
		{
			System.out.println(data);		
			System.out.println("----".repeat(20));
		}
	}
	
	private static void printStudentScalarValues(List<Object[]> obj)
	{
		for(Object[] ob : obj)
		{
			for(int i=0; i<ob.length; i++)
			{
				System.out.print(ob[i] + ", ");
			}
			System.out.println();
		}
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		
//	List<Student> list = studentService.fetchAllByGreaterThanPerAndGender(60.0, Gender.MALE);
//	printStudents(list);

		/***  ***/
		
/*		List<Object[]> list = studentService.fetchGenderAndName();
		printStudentScalarValues(list);
*/	
	}

	


}
