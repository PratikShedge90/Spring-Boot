package com.tca.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCmdRunner3 implements CommandLineRunner
{

	@Override
	public void run(String... args) throws Exception 
	{	
		System.out.println("CommandLine Runner Task...!");
	}
}
