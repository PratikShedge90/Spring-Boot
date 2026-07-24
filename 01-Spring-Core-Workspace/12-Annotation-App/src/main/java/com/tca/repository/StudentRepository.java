package com.tca.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.tca.model.Student;

@Repository
public class StudentRepository 
{
	@Autowired
	@Qualifier("getStudentStore2")
	private Map<String, Student> hm; 		//Due to (Bean Method) Injection Takes place Over this Case Bcoz it is Pre-defined class
	
	
	public Student findById(String studentId)
	{
		return hm.get(studentId);
	}
	
	public Map<String, Student> findAll()
	{
		return hm;
	}

}
