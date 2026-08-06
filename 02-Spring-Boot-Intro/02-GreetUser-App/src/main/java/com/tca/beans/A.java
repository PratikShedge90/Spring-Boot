package com.tca.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A 
{
	//@Autowired
	static B b;			// Static is allowed in Field Injection Using Reflection API
	
/*
	@Autowired	
	public A(B b)	    // Static Ref DI through Constructor Allowed
	{
		this.b=b;
		System.out.println("A - Bean Created Using Constructor Injection !!");
	}
*/
	
	@Autowired
	public void setB(B b)
	{
		this.b=b;
		System.out.println("A - Bean Created Using Setter Injection !!");
	}
	
	public void MethodA()
	{
		b.MethodB();
	}
}
