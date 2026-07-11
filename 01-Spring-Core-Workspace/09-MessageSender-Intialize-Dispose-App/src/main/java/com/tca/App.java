package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.beans.MessageSender;

public class App {
    public static void main(String[] args) 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        	
        MessageSender ms = context.getBean(MessageSender.class);
        ms.send();
        
        
        ((ClassPathXmlApplicationContext)context).close();
        
        System.out.println("byee");
    }
}
