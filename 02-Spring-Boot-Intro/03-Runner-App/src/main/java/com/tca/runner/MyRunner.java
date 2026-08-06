package com.tca.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(2)
public class MyRunner implements ApplicationRunner 
{

	@Override
	public void run(ApplicationArguments args) throws Exception 
	{	
		System.out.println("Task 1 - Database Task Executing ");
	}

}
