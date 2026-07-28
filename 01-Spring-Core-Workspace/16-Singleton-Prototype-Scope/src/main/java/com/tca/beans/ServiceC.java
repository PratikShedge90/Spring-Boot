package com.tca.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceC 
{
	@Autowired
	private ServiceB serviceB;
	
	public ServiceC()
	{
		System.out.println("Constructor - ServiceC");	// 
	}

}
