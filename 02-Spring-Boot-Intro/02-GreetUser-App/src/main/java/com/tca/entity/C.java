package com.tca.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C 
{
	/** Dependency Injection doesn't work for static final References. */
	//@Autowired
	//static final D d;
	final D d;
	

	@Autowired
	public C(D d)
	{
		this.d=d;
		System.out.println("C - Bean Created Using Constructor Injection !!");
	}

	
/*	
  	// Setter is not Applicable with final
  	 
	@Autowired
	public void setD(D d)
	{
		this.d=d;
		System.out.println("C - Bean Created Using Setter Injection !!");
	}
*/	
	public void MethodC()
	{
		d.MethodD();
	}
}
