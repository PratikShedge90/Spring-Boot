package com.tca.beans;

import org.springframework.stereotype.Component;

@Component
public class WelcomeBean 
{
	public WelcomeBean() 
	{
		System.out.println("Welcome Bean is Created !");
	}
	
	public void printMessage()
	{
		System.out.println("Welcome to Spring Boot ");
	}
}
