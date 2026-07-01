package com.tca;

public class WelcomeBean 
{
	private int id;
	private String message;
	
	public WelcomeBean(int id, String message)
	{
		this.id=id;
		this.message=message;
	}
	
	public String getMessage()
	{
		return "Hey There this My First Program !!";
	}
	
	public int getId()
	{
		return id;
	}

}
