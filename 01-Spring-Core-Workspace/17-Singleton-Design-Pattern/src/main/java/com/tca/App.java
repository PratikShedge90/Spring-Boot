package com.tca;

import com.tca.pack.Car;

public class App 
{
    public static void main(String[] args) 
    {
    	Car c = Car.getInstance();
    	Car c1 = Car.getInstance();

    	System.out.println(c);
    	System.out.println(c1);
    	
    }
}
