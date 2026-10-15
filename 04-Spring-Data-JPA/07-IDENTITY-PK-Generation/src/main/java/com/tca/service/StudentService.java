package com.tca.service;

import java.util.List;

import com.tca.entity.Student;


public interface StudentService {
	
	public Student addStudent(Student s);
	
	public List<Student> fetchAll();
}
