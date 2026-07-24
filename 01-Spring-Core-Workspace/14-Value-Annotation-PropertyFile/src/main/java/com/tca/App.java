package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tca.config.AppConfig;
import com.tca.service.AdminService;
import com.tca.service.EmailService;

public class App 
{
    public static void main(String[] args) 
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	AdminService service = context.getBean(AdminService.class);
    	service.printInformation();
    	
    	System.out.println("============================================");
    	
    	EmailService emailservice = context.getBean(EmailService.class);
    	emailservice.sendMail();
    	
    	
    }
}
