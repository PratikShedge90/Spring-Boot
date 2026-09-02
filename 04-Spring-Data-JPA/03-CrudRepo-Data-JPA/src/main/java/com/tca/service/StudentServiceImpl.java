package com.tca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

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
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		Optional<Student> studentResp = studentRepository.findById(student.getRno());
		
		if(studentResp.isPresent())
		{
			Student std = studentResp.get();
			std.setName(student.getName());
			std.setGender(student.getGender());
			std.setPer(student.getPer());
			std.setBirthDate(student.getBirthDate());
			
			return studentRepository.save(std);
		}
		throw new ResourceNotFoundException("Student not found with roll number: " + student.getRno());
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
	public void deleteStudent(Integer id) {
	
		if(studentRepository.existsById(id)) {
			studentRepository.deleteById(id);
			return;
		}else {
			System.out.println("Not Found Data");
		}
		
	}

	@Override
	public List<Student> saveAllStudents(List<Student> list) {
		
		return (List<Student>) studentRepository.saveAll(list);
	}
	

}
