package com.tca.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetBean 
{
	private WelcomeBean welcomeBean;
/*
	@Autowired
	public GreetBean(WelcomeBean welcomeBean) 
	{
		this.welcomeBean = welcomeBean;
		System.out.println("GreetBean is Create -> Using Construction-Injection !!");
	}
*/
	@Autowired
	public void setWelcomeBean(WelcomeBean welcomeBean)
	{
		this.welcomeBean=welcomeBean;
		System.out.println("GreetBean is Created --> Using Setter Injection !!");
	}
	
	public void greet()
	{
		welcomeBean.printMessage();
	}
	
}
