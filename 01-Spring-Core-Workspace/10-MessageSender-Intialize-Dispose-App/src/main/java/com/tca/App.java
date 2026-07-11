package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.beans.MessageSender;

public class App {
    public static void main(String[] args) 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        	
        MessageSender ms = (MessageSender)context.getBean("messageSender");
        ms.send();
        
//        ((ClassPathXmlApplicationContext)context).close();
        
        ( (ClassPathXmlApplicationContext)context ).close();
        
        System.out.println("byee");
    }
}

