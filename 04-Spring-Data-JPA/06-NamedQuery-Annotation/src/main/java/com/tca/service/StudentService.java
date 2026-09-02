package com.tca.service;

import java.util.List;

import com.tca.entity.Gender;
import com.tca.entity.Student;

public interface StudentService 
{
	public List<Student> fetchAllByGreaterThanPerAndGender(Double per, Gender gender);
	
	public void modifyStudnetName(String name, Integer rno);
	
	public List<Object[]> fetchGenderAndName();
	
	public List<Object[]> countByGender();
	
}
