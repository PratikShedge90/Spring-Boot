package com.cdac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("tca.properties")
public class Application {

	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
		
		for(String data : args)
		{
			System.out.println(data);
		}
	}

}
