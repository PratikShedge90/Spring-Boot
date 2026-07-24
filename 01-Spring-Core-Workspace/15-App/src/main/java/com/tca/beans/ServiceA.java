package com.tca.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ServiceA 
{
	public ServiceA()
	{
		System.out.println("Constructor Invoked !!");
	}

}
