package com.tca.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tca.entity.Student;

// No @Repository Needed --> In Hierarchy CrudRep is child interface 
public interface StudentRepository extends CrudRepository<Student,Integer> 
{
	
}
