package com.tca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tca.entity.Gender;
import com.tca.entity.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

	
	public List<Student> findAllByGreaterThanPerAndGender(@Param("per")Double per,
												   @Param("gender")Gender gender);
	@Modifying
	@Transactional
	public void updateName(@Param("userName") String name, @Param("UserRno") Integer rno);
	
	public List<Object[]> findGenderAndName();
	
	public List<Object[]> countByGender();
	
}
