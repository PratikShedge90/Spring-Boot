package com.tca;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tca.beans.ServiceB;
import com.tca.config.AppConfig;

public class App 
{
    public static void main(String[] args) 
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
 
    	//ServiceA ob = context.getBean(ServiceA.class);
    	
//    	System.out.println("Bye.......!");
//    	
//    	Map<String, ServiceB> beans = context.getBeansOfType(ServiceB.class);
//    	
//    	for(Map.Entry<String, ServiceB> data : beans.entrySet() )
//    	{
//    		System.out.println(data.getKey() + " " + data.getValue());
//    	}
    	
    	/***
    	    Output-->
    	    serviceB com.tca.beans.ServiceB@194fad1
			pratik   com.tca.beans.ServiceB@26abb146
    	 */
    	
    }
}
