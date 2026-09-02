package com.tca.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tca.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> 
{
	Optional<Student> findByIdAndDeletedIsFalse(Long id);
	
//	List<Student> findAllAndDeletedFalse();		--> This Created The Error
	
	// findBy + fieldName + condition This is the Syntax 
	List<Student> findByDeletedIsFalse();
	
//	Optional<Student> existsByIdAndDeletedIsFalse(Long id);
	
	Boolean existsByEmail(String emailId);
}
