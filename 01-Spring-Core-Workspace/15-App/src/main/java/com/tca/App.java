package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tca.beans.ServiceA;
import com.tca.config.AppConfig;

public class App 
{
    public static void main(String[] args) 
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
 
    	/** This is Eager Initialization 
    	 
    	ServiceA ob = context.getBean(ServiceA.class);	// We are Req to SC I want a Bean object for ServiceA class
    	ServiceA ob2 = context.getBean(ServiceA.class);
    	
    	System.out.println(ob);
    	System.out.println(ob2);
    	*/
    	
    	
    	/** Lazy Initialization Of Bean Object   */
    	ServiceA ob = context.getBean(ServiceA.class);
    	ServiceA ob2 = context.getBean(ServiceA.class);
    	
    	System.out.println(ob);
    	System.out.println(ob2);
    	
    	System.out.println("Bye......!");
    	
    }
}
