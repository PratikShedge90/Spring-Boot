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
	public List<Student> fetchAll() {
		return studentRepository.findAll();
	}


	@Override
	public List<Student> fetchAllUsingSQL() {	
		return studentRepository.finAllUsingSQL();
	}


	@Override
	public List<Student> findPercentageRangeStudent(Double start, Double end) {	
		return studentRepository.findPercentageRangeUsingJPQL(start, end);
	}


	@Override
	public List<Object[]> findNamePerGender(Double per, Gender gender) {	
		return studentRepository.findNamePerGender(per, gender);
	}


	@Override
	public void removeByPerAndGender(Double per, Gender gender) {
		studentRepository.deleteByPerAndGender(per, gender);
	}


	@Override
	public void updateStudentByNameAndId(String name, Integer rno) {
		studentRepository.updateByNameAndId(name, rno);
		
	}

}
