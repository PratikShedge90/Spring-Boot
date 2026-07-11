package com.tca;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.beans.ServiceA;

public class App {
    public static void main(String[] args) 
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	ServiceA serA = context.getBean(ServiceA.class);
    	serA.printMessage();
    	
    	
    	context.close();
    }
}
