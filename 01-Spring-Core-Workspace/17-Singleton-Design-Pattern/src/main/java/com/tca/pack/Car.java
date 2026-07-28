package com.tca.pack;

public class Car 
{
	private static Car ob=null;
	
	private Car()
	{
		System.out.println("Constructor Car");
	}
	
	public static Car getInstance()
	{
		if(ob == null)
		{
			synchronized(Car.class)
			{
				if(ob == null)
				{
					ob = new Car();
				}
			}
		}
		return ob;
	}
}
