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
/*	
		//Test Code - save()
		Student student = new Student(102,"Hrutik",80.33,Gender.MALE, LocalDate.of(2000, 8, 23));
		Student studentResponse = studentService.saveStudent(student);
		System.out.println("Student Data is Saved SuccessFully " + studentResponse);
*/
/*		
		// Test Code - update()
		Student student = new Student(103,"Aniket",55.33,Gender.MALE, LocalDate.of(2003, 8, 23));
		
		Student studentResponse = studentService.updateStudent(student);
		System.out.println(studentResponse);
*/
/*		
		// Test Code - findById()
		Integer rno = 101;
		Optional<Student> studentResp = studentService.fetchById(rno);
		if(studentResp.isPresent()) {
			Student s = studentResp.get();
			System.out.println(s);
		}else {
			System.out.println("No User Found for Roll_Number : " + rno );
		}
*/
/*		// Test Code - findAll()
		
		List<Student> studentList = studentService.fetchAllStudent();
		if(!studentList.isEmpty())
		{
			printStudents(studentList);
		}
		System.out.println("No Data Found");
	}
*/	
/*		//Test Code - deleteById()
		
		studentService.deleteStudent(102);
*/
		//Test Code - saveAll()
		
		List<Student> list = new LinkedList<>();
		list.add(new Student(103,"Aniket",55.33,Gender.MALE, LocalDate.of(2003, 8, 23)));
		list.add(new Student(104,"Shushant",65.33,Gender.MALE, LocalDate.of(2005, 3, 13)));
		list.add(new Student(105,"Vaishnavi",45.33,Gender.FEMALE, LocalDate.of(2004, 2, 2)));
		list.add(new Student(106,"Sakshi",75.33,Gender.FEMALE, LocalDate.of(2001, 9, 3)));
		
		List<Student> L = studentService.saveAllStudents(list);
		printStudents(L);
		
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
