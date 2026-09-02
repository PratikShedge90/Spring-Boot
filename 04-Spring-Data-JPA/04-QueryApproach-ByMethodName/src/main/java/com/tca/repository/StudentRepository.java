package com.tca.repository;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tca.entity.Gender;
import com.tca.entity.Student;

// No @Repository Needed --> In Hierarchy CrudRep is child interface 
public interface StudentRepository extends CrudRepository<Student,Integer> 
{
	List<Student> findByGender(Gender gender);  
	
	List<Student> findByBirthDate(LocalDate localDate);
	
	List<Student> findByName(String name);																																	
	
	/** Query Creation using Method Name with Condition*/
	
	List<Student> findByBirthDateGreaterThan(LocalDate localDate);
	
	List<Student> findByPerBetween(Double start, Double end);
	
	List<Student> findByGenderOrderByPerDesc(String gender);
	
	List<Student> findFirst2ByGenderOrderByPerDesc(Gender gender);
}
