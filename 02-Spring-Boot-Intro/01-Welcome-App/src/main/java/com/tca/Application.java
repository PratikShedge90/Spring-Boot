package com.tca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.tca.beans.Car;
import com.tca.beans.GreetBean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		System.out.println("Container Name : " + context.getClass().getName() );
		
//		WelcomeBean wb = context.getBean(WelcomeBean.class);
//		wb.printMessage();
		
		GreetBean gb = context.getBean(GreetBean.class);
		gb.greet();
	} 
	
	
	@Bean
	public Car car()
	{
		System.out.println("Car Object Created !!");
		return new Car();
	}

}
