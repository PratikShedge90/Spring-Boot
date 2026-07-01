package com.tca.entities;

public class ServiceB 
{
	ServiceA serviceA;
	
	public ServiceB( ServiceA serviceA)
	{
		System.out.println("Constructing Service of B");
		this.serviceA=serviceA;
	}
	
	public void display()
	{
		System.out.println("Service B : Display Method !!");
	}

}
