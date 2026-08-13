package com.cdac.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository 
{
	@Autowired
	SimpleJdbcCall jdbcCall;
	
	public String getStudentGrade(int rno)
	{
		jdbcCall.withFunctionName("get_grade");
		jdbcCall.withCatalogName("sb01db");
		
		Map<String, Object> map = jdbcCall.execute(rno);
		return map.get("return").toString();
	}

}
