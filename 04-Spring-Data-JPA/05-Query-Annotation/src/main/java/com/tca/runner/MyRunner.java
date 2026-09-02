package com.tca.runner;

import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Gender;
import com.tca.entity.Student;
import com.tca.service.StudentService;

@Component
public class MyRunner implements ApplicationRunner {

	private final StudentService studentService;

	MyRunner(StudentService studentService) {
		this.studentService = studentService;
	}
	
	private static void printStudents(List<Student> L)
	{
		for(Student data : L)
		{
			System.out.println(data);		
			System.out.println("----".repeat(20));
		}
	}
	
	private static void printStudentScalarValues(List<Object[]> obj)
	{
		for(Object[] ob : obj)
		{
			for(int i=0; i<ob.length; i++)
			{
				System.out.print(ob[i] + ", ");
			}
			System.out.println();
		}
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		/** Test Code : Fetch All Data By JPQL*/
/*		
		List<Student> listOfStudent = studentService.fetchAll();
		printStudents(listOfStudent);
*/		

		/** Test Code : Fetch All Data By SQL*/
/*		List<Student> listOfStudent = studentService.fetchAllUsingSQL();
		printStudents(listOfStudent);
*/		
		
		/** Test Code : Find PercentageRange of Student */
/*		List<Student> listOfStudent = studentService.findPercentageRangeStudent(60.0,90.0);
		printStudents(listOfStudent);
*/
		
		/** Test Code : Fetch Selected Columns (Scalar Projection)*/
	/*	List<Object[]> list = studentService.findNamePerGender(60.0, Gender.MALE);
		printStudentScalarValues(list);
	*/
		
		/** Test Code : Delete Using @Modifying & @Transactional */
/*		studentService.removeByPerAndGender(70.0, Gender.FEMALE);	
		System.out.println("Student Record is Deleted ");
*/
		
		/** Test Code : Update Using @Modifying & @Transactional */
		studentService.updateStudentByNameAndId("Saurav", 101);
		System.out.println("Student Record is Updated ");
		
		
		
		
		
	}

	


}
