package com.tca.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.tca.entity.Gender;
import com.tca.entity.Student;

public interface StudentService 
{
	public Optional<Student> fetchById(Integer id);
	public List<Student> fetchAllStudent();
	
	/** -----------Query Creation Using Method Name Approach -----------------*/
	
	public List<Student> fetchByGender(Gender gender);
	public List<Student> fetchByBirthDate(LocalDate localDate);
	public List<Student> fecthByName(String name);
	
	/** -----------Query Creation Using Method Name with Conditions -----------------*/
	
	public List<Student> fetchByBirthDateGreaterThan(LocalDate localDate);
	public List<Student> fetchByPercentageBetween(Double start, Double end);

	public List<Student> fetchFirst2ByGenderOrderByPerDesc(Gender gender);
	
}

