package com.cdac.repository;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.model.Student;

@Repository
public class StudentRepository 
{
	@Autowired
	JdbcTemplate jt;
	
	public boolean saveStudent(Student ob)
	{
		String sql = "INSERT INTO student VALUES (?,?,?,?)";
//		jt.update(sql, ob.getRno(), ob.getName(),ob.getPer(), ob.getCity());
		
		// Java 8 code for this API	
		return Optional.ofNullable(ob).map(s -> jt.update(sql, s.getRno(), s.getName(), s.getPer(), s.getCity()) )
		.map(rows -> rows > 0).orElse(false);
	}
	
	public int deleteStudent(int rno)
	{
		String sql = "DELETE FROM student WHERE rno=?";
	//	return jt.update(sql,rno);
		
	/*	return Optional.of(jt.update(sql, rno)).filter(rows -> rows > 0).isPresent(); 	*/	
		
	/** If I have to return int type to the method */	
	    return Optional.of(jt.update(sql, rno)).filter(rows -> rows > 0).orElse(0);
	}
	
	public int deleteStudent(String city)
	{
		String sql = "DELETE FROM student WHERE city=?";
		return Optional.of(jt.update(sql, city)).filter(rows -> rows > 0).orElse(0);
	}
	
	public int updateStudent(Student ob)
	{
		String sql = "UPDATE student SET name=?, per=?, city=? WHERE rno=?";		
//		return jt.update(sql, ob.getName(), ob.getPer(), ob.getCity(), ob.getRno());		
		return Optional.ofNullable(ob).map(s -> jt.update(sql, ob.getName(), ob.getPer(), ob.getCity(), ob.getRno())).orElse(0);		
	}
	
	public Map<String,Object> findById(int rno)
	{
		String sql = "SELECT * FROM student WHERE rno=?";
		return jt.queryForMap(sql,rno);
		
	}
	
	public List<Map<String,Object>> findAll()
	{
		String sql = "SELECT * FROM student";
		return jt.queryForList(sql);
	}
	
	public List<Map<String,Object>> findCityWise(String city)
	{
		String sql = "SELECT * FROM student WHERE city=?";
		return jt.queryForList(sql,city);		
	}

}
