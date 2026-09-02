package com.emart.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.emart.dto.StudentRequestDTO;
import com.emart.dto.StudentResponseDTO;
import com.emart.entity.Student;
import com.emart.exception.DuplicateResourceException;
import com.emart.repository.StudentRepository;

@Service
public class StudentService 
{
	private final StudentRepository studentRepository;	
	
	public StudentService(StudentRepository studentRepository){
		this.studentRepository=studentRepository;
	}
	
	
	
	public StudentResponseDTO createStudent(StudentRequestDTO studentReqDTO)
	{
		Student studentEntity = mapToEntity(studentReqDTO);	
		
		if(emailExists(studentEntity))
		{
			throw new DuplicateResourceException("student with email " + studentEntity.getEmail() +
			" already Exists !");
		}
		
		Student studentResp = studentRepository.save(studentEntity);
		return mapToDTO(studentResp);
	}
	
	public StudentResponseDTO getStudentById(Long reqId)
	{
		Optional<Student> studentResp = studentRepository.findByIdAndDeletedIsFalse(reqId);
		if(studentResp.isPresent()) {
			return mapToDTO(studentResp.get());
		}
		return null;
	}
	
	public List<StudentResponseDTO> getAllStudent()
	{
		List<Student> studentList = studentRepository.findByDeletedIsFalse();
		
	    List<StudentResponseDTO> responseList = new ArrayList<>(); /** Approach 1: Beginner */
	    for (Student student : studentList) {
	        responseList.add(mapToDTO(student));
	    }
	    return responseList;
	    
	    /** Approach 2: Moderate */
	/*	return studentList.stream()
				.map(this::mapToDTO)
				.toList(); 
	*/
	}
	
	public Student updateStudent(Long id, Student studentReq)
	{
		Optional<Student> existingStudent  = studentRepository.findByIdAndDeletedIsFalse(id);
		
		if(existingStudent.isEmpty()) {
			return null;
		}
		
		Student studentToSave = existingStudent.get();
		
		studentToSave.setRno(studentReq.getRno());
		studentToSave.setName(studentReq.getName());
		studentToSave.setEmail(studentReq.getEmail());
		studentToSave.setAge(studentReq.getAge());
		studentToSave.setSubject(studentReq.getSubject());
		return studentRepository.save(studentToSave);
	}
	
    public Boolean deleteStudent(Long id) {
        Boolean isStudent = studentRepository.existsById(id);

        if(!isStudent) return false;

        studentRepository.deleteById(id);

        return true;
    }

	public Boolean deleteStudentSoftly(Long id)
	{
		Optional<Student> existingStudent = studentRepository.findByIdAndDeletedIsFalse(id);
		
		if(existingStudent.isEmpty()) {
			return false;
		}	
		Student stdToSave = existingStudent.get();
		stdToSave.setDeleted(true);
		
		studentRepository.save(stdToSave);		
		return true;
	}
	
	/** Helper Method To Convert DTO-->Entity */
	
	private Student mapToEntity(StudentRequestDTO studentReqDTO)
	{
		Student student = new Student();
		
		student.setRno(studentReqDTO.getRno());
		student.setName(studentReqDTO.getName());
		student.setAge(studentReqDTO.getAge());
		student.setEmail(studentReqDTO.getEmail());
		student.setSubject(studentReqDTO.getSubject());	
		student.setDeleted(false);
		student.setCreatedAt(LocalDateTime.now());
		student.setUpdatedAt(LocalDateTime.now());
		
		return student; 	// We Will Implement it Ahead with Builder Design Pattern
	}
	
	private StudentResponseDTO mapToDTO(Student student)
	{
		StudentResponseDTO studentRespDTO = new StudentResponseDTO();
		studentRespDTO.setId(student.getId());
		studentRespDTO.setRno(student.getRno());
		studentRespDTO.setName(student.getName());
		studentRespDTO.setEmail(student.getEmail());
		studentRespDTO.setAge(student.getAge());
		studentRespDTO.setSubject(student.getSubject());
		studentRespDTO.setMessage("Student Saved SuccessFully !!");
		return studentRespDTO;
	}
	
	private boolean emailExists(Student student)
	{
		return studentRepository.existsByEmail(student.getEmail());
	}
	
}
