package com.cdac.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class InitRunner implements ApplicationRunner 
{
	@Autowired
	JdbcTemplate jt;

	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		
		jt.execute("DROP TABLE IF EXISTS student");
		System.out.println("Table is Dropped");
		
		jt.execute("CREATE TABLE student(rno int PRIMARY KEY, name varchar(50),per float,city varchar(50));" );
		System.out.println("Table is Created");
		
		jt.update("INSERT INTO student VALUES (101,'Pratik', 90.10, 'PUNE')");
		jt.update("INSERT INTO student VALUES (102,'Saurav', 80.10, 'THANE')");
		jt.update("INSERT INTO student VALUES (103,'Aniket', 70.10, 'MUMBAI')");
		jt.update("INSERT INTO student VALUES (104,'Som', 50.10, 'DELHI')");
		
		System.out.println("Data Inserted SuccessFully ..!");
		
		
	}
	

}
