package com.tca.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ServiceA implements BeanNameAware, ApplicationContextAware
{
	private String message;
	
	private String myBeanName;
	
	private ApplicationContext myContext;
	
	public ServiceA()
	{
		System.out.println("Creation of Bean !!");
	}
	
	public void setMessage(String message)
	{
		this.message=message;
		System.out.println("Bean Setter Injection !!");
	}
	
	public void printMessage()
	{
		System.out.println("Printing Message --> " + message);
	}

	@Override
	public void setBeanName(String name)  // name : sa  -> ob.setBeanName("sa")  Internally this is done by SC 
	{
		System.out.println("Name of Bean(Id) : " + name);
		myBeanName = name;
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException 
	{
		this.myContext = context;
		System.out.println("My Spring Container Name : " + context);
	}
	
	
	

}
