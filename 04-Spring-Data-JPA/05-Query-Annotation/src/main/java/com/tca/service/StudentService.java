package com.tca.service;

import java.util.List;

import com.tca.entity.Gender;
import com.tca.entity.Student;

public interface StudentService 
{
	public List<Student> fetchAll();
	
	public List<Student> fetchAllUsingSQL();
	
	public List<Student> findPercentageRangeStudent(Double start, Double end);
	
	public List<Object[]> findNamePerGender(Double per, Gender gender);
	
	/** @Query Annotation for DML operations */
	public void removeByPerAndGender(Double per, Gender gender);
	public void updateStudentByNameAndId(String name, Integer rno);
	
	
}
