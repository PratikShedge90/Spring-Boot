package com.tca.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tca.entity.Gender;
import com.tca.entity.Student;
import com.tca.exceptions.ResourceNotFoundException;
import com.tca.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;	
	public StudentServiceImpl(StudentRepository studentRepository)
	{
		this.studentRepository=studentRepository;
	}
	


	@Override
	public Optional<Student> fetchById(Integer id) {
	    return studentRepository.findById(id);
/*
		return Optional.ofNullable(studentRepository.findById(id)
	        .orElseThrow(() -> new ResourceNotFoundException("Student not found with ID: " + id)));
*/
	}

	@Override
	public List<Student> fetchAllStudent() {
		return (List<Student>)studentRepository.findAll();
	}



	@Override
	public List<Student> fetchByGender(Gender gender) {
		
		return (List<Student>) studentRepository.findByGender(gender);
	}



	@Override
	public List<Student> fetchByBirthDate(LocalDate localDate) {
		
		return studentRepository.findByBirthDate(localDate);
	}



	@Override
	public List<Student> fecthByName(String name) {
		
		return studentRepository.findByName(name);
	}



	@Override
	public List<Student> fetchByBirthDateGreaterThan(LocalDate localDate) {
		return studentRepository.findByBirthDateGreaterThan(localDate);
	}



	@Override
	public List<Student> fetchByPercentageBetween(Double start, Double end) {
		return studentRepository.findByPerBetween(start, end);
	}



	@Override
	public List<Student> fetchFirst2ByGenderOrderByPerDesc(Gender gender) {
		
		return studentRepository.findFirst2ByGenderOrderByPerDesc(gender);
	}



}
