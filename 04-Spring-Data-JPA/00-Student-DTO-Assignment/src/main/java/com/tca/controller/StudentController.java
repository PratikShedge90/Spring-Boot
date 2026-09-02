package com.tca.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tca.dto.StudentRequestDTO;
import com.tca.dto.StudentResponseDTO;
import com.tca.entity.Student;
import com.tca.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/students")
public class StudentController 
{
	private final StudentService studentService;

	StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@PostMapping()
	public ResponseEntity<StudentResponseDTO> createStudent(@Valid @RequestBody StudentRequestDTO studentReqDTO)
	{
		StudentResponseDTO createdStudent = studentService.createStudent(studentReqDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<StudentResponseDTO> getStudentById(@PathVariable Long id)
	{
		StudentResponseDTO getStudent = studentService.getStudentById(id);
		if(getStudent==null) 
		{
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(getStudent);
	}
	
	@GetMapping()
	public ResponseEntity<List<StudentResponseDTO>> getAllStudent()
	{
		List<StudentResponseDTO> studentList = studentService.getAllStudent();
		
		if(studentList.isEmpty())
		{
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(studentList);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable Long id,
												 @RequestBody Student student)
	{
		Student updatedResp = studentService.updateStudent(id,student);		
		if(updatedResp == null)
		{
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(updatedResp);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Long id)
	{
		Boolean isDeleted = studentService.deleteStudent(id);
		
		if(!isDeleted) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok("Record is Deleted");
	}
	
	
	@PatchMapping("/{id}")
	public ResponseEntity<String> deleteStudentSoftly(@PathVariable Long id)
	{
		Boolean isDeleted = studentService.deleteStudentSoftly(id);
		
		if(!isDeleted) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok("Record is Deleted");
	}
	
}
