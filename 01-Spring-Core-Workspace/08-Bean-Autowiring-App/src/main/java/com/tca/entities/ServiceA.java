package com.tca.entities;

public class ServiceA 
{
	private ServiceB serviceB;
	
	public ServiceA() {
	}
	
	// Constructor Injection
	public ServiceA(ServiceB serviceB)
	{
		this.serviceB=serviceB;
		System.out.println("Constructor Injection -->");
	}
	
	//Setter Injection
//	public void setServiceB(ServiceB serviceB)
//	{
//		this.serviceB=serviceB;
//		System.out.println("Setter Injection -->");
//	}
	
	// Even-Though you write Auto-wiring you have to write CI,SI compulsory.
}
