package com.tca.service;

import java.util.List;
import java.util.Optional;

import com.tca.entity.Student;

public interface StudentService 
{
	public Student saveStudent(Student student);
	public Student updateStudent(Student student);
	
	public List<Student> saveAllStudents(List<Student> list);
	
	public Optional<Student> fetchById(Integer id);
	public List<Student> fetchAllStudent();
	
	public void deleteStudent(Integer id);
	
	
}

