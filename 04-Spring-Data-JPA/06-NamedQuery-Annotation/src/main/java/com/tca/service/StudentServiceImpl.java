package com.tca.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tca.entity.Gender;
import com.tca.entity.Student;
import com.tca.repository.StudentRepository;

@Service()
public class StudentServiceImpl implements StudentService {
	
	private final StudentRepository studentRepository;	
	public StudentServiceImpl(StudentRepository studentRepository)
	{
		this.studentRepository=studentRepository;
	}
	@Override
	public List<Student> fetchAllByGreaterThanPerAndGender(Double per, Gender gender) {
		
		return studentRepository.findAllByGreaterThanPerAndGender(per, gender);
	}
	@Override
	public void modifyName(String name, Integer rno) {
		
		studentRepository.updateName(name,rno);
	}
	@Override
	public List<Object[]> fetchGenderAndName() {
		return studentRepository.findGenderAndName();
	}
	
	

}
