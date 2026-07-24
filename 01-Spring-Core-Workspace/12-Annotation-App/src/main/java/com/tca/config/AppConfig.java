package com.tca.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.tca.model.Student;

@Configuration
@ComponentScan(basePackages={"com.tca", "com.tca.repository"})
public class AppConfig
{
	
	@Bean
	@Primary
	Map<String, Student> getStudentStore()
	{
		Map<String, Student> hm = new HashMap<>();
		
		hm.put("SB-1", new Student("Pratik", "Pune", 90.0));
		hm.put("SB-2", new Student("Saurav", "Thane", 80.0));
		
		return hm;
	}
	
	@Bean
	@Primary
	Map<String, Student> getStudentStore2()
	{
		Map<String, Student> hm = new HashMap<>();
		
		hm.put("SB-1", new Student("Aniket", "Raigad", 90.0));
		hm.put("SB-2", new Student("Sakshi", "Delhi", 80.0));
		
		return hm;
	}
	
}