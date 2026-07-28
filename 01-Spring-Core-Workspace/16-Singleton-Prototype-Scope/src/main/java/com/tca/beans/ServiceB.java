package com.tca.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class ServiceB 
{	
	public ServiceB()
	{
		System.out.println("Constructor - ServiceB");
	}

}
