package com.cdac.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

@Configuration
public class MyConfig 
{

	@Bean
	public SimpleJdbcCall getJdbcCall(DataSource source)
	{
		//return new SimpleJdbcCall(source).withFunctionName("get_grade");
		
		return new SimpleJdbcCall(source);
	}

}
