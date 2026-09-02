package com.tca;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tca.repository.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		
		Student ob = new Student(101,"Pratik",90.44);
		
		Student ob2 = new Student(102,"Saurav",88.55);
		
		Student ob3 = new Student(103,"Aniket",97.44);
		
		System.out.println(ob);
		System.out.println(ob2);
		
		Student ob4 = new Student(101,"Pratik",90.44);
		
		System.out.println("ob is Reference to ob4 == : " + (ob == ob4));
		System.out.println("ob is .equals() to ob4 : " + (ob.equals(ob4)));
		
	}

}
