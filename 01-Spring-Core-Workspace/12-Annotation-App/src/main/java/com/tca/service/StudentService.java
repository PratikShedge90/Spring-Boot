package com.tca.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.model.Student;
import com.tca.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;
	
	
	public Student getStudentById(String key)
	{
		return repo.findById(key);
	}
	
	public Map<String,Student> getAllStudent()
	{
		return repo.findAll();
	}

}
