package com.tca;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tca.config.AppConfig;
import com.tca.model.Student;
import com.tca.service.StudentService;

public class App 
{
    public static void main(String[] args) 
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	StudentService service = context.getBean(StudentService.class);
    	
    	/*
    	Student s = service.getStudentById("SB-7");
    	
    	if(s!=null) 
    	{
    		System.out.println(s);
    	}
    	else 
    	{
    		System.out.println("Data Not Found !!");
    	}
    	*/
    	
    	Map<String, Student> students = service.getAllStudent();
    	
    	for(Map.Entry<String, Student> entry : students.entrySet() )
    	{
    		System.out.println(entry.getKey() +" --> " + entry.getValue() + "\n");
    	}
    	
    }
}
