package com.tca.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Gender;
import com.tca.entity.Student;
import com.tca.service.StudentService;

@Component
public class MyRunner implements ApplicationRunner {

	@Autowired
	private StudentService studentService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Student s = new Student();
	//	s.setId(2L);
		s.setName("Hrutik");
		s.setPer(69.54);
		s.setGender(Gender.MALE);	
		Student respStd = studentService.addStudent(s);
		
		System.out.println(respStd);
		
//		List<Student> list = studentService.fetchAll();
//		
//		for(Student data : list)
//		{
//			System.out.println(data);
//		}
		
	}
}



