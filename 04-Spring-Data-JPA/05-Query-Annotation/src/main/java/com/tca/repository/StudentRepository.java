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

	@Query("select s from Student s")
	public List<Student> findAll();
	

	@Query(value = "SELECT * FROM student", nativeQuery=true)
	public List<Student> finAllUsingSQL();
	
	
	//@Query("select s from Student s where s.per>=?1 and s.per<=?2")   //JPQL with Positional Parameter
	@Query("select s from Student s where s.per>= :low and s.per<= :high")   //JPQL with Named Parameter
	public List<Student> findPercentageRangeUsingJPQL(@Param("low")  Double start,
													  @Param("high") Double end);
	
	
	//SQL with Positional Parameter
   //@Query(value="SELECT * FROM student WHERE s.per>=?1AND s.per<=?2", nativeQuery=true)
	@Query(value="SELECT * FROM student WHERE s.per>=:low AND s.per<=high", nativeQuery=true)
	public List<Student> findPercentageRangeUsingSQL(@Param("low")Double start,
													 @Param("high")Double end);
	
	
	/**  Scalar Projection **/
	
	@Query("SELECT s.name, s.per, s.gender FROM Student s WHERE s.per>=:per AND s.gender=:gender")
	public List<Object[]> findNamePerGender(@Param("per")Double per,
											@Param("gender")Gender gender);
	
//	@Query(value = "SELECT name, per, gender FROM student WHERE per>=:per AND gender=:gender", nativeQuery=true)
//	public List<Object[]> findNamePerGender(@Param("per")Double per, @Param("gender")Gender gender);
	
	/** DML Using Query Annotation **/
	
	@Modifying
	@Transactional
	@Query("delete from Student s where s.per>=:per and s.gender=:gender")
	public void deleteByPerAndGender(@Param("per")Double per, @Param("gender")Gender gender);
	
	
	@Modifying
	@Transactional
	@Query("update Student s set s.name =:studentName where s.rno =:rno")
	public void updateByNameAndId(@Param("studentName") String name, @Param("rno") Integer rno );
	
	
	
}
