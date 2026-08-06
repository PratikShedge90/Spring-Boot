package com.tca.beans;

import org.springframework.stereotype.Component;

@Component
public class B 
{
	public B()
	{
		System.out.println("B - Bean Created !!");
	}
	
	public void MethodB()
	{
		System.out.println("I Love Spring Boot !!");
	}
}
