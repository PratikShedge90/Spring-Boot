package com.tca;

import com.tca.entity.ExamResult;
import com.tca.entity.Gender;
import com.tca.entity.Student;

public class App {

	public static void main(String[] args) 
	{
//		Gender g = Gender.MALE;
//		
//		System.out.println(Gender.MALE.ordinal());
//		System.out.println(Gender.MALE.getValue());
//
//		Student s = new Student(101,"Pratik",75.57,Gender.MALE,ExamResult.PASS);
//		System.out.println(s);
		
		for(Gender g  : Gender.values())
		{
			System.out.println(g + " -> "+g.ordinal());
		}
		
	}

}
