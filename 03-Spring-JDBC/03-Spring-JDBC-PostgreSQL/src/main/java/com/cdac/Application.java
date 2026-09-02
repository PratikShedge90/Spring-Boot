package com.cdac;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cdac.repository.StudentRepository;

@SpringBootApplication
public class Application 
{
//	@Autowired
//	static StudentRepository repo;

	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository repo = context.getBean(StudentRepository.class);
		
		/** Test Case - INSERT */
/*		Student s = new Student(201,"AAA",75.57, "THANE");
		StudentRepository repo = context.getBean(StudentRepository.class);
		repo.saveStudent(s);
*/
		/** Test Case - DELETE */
/*		
		int status = repo.deleteStudent(201);
		
		if(status == 0) {
			System.out.println("No Record Found for Deletion");
		}else {
			System.out.println("Record Deletion in SuccessFull " + status );
		}
*/
		/** Test Case - UPDATE */
/*		Student ob = new Student();
		ob.setName("Tanish");
		ob.setPer(77);
		ob.setCity("Delhi");
		ob.setRno(105);
		
		int status = repo.updateStudent(ob);	
		if(status == 0) {
			System.out.println("No Record Found for Updation");
		}else {
			System.out.println("Record Updated SuccessFully " + status );
		}
*/
											/**Select statement Starts*/
		/** Test-Case : findById() **/
/*		int rno=102;
		Map<String,Object> map = repo.findById(rno);
		System.out.println(map);
*/
		/** Test-Case : findAll() **/
/*		List<Map<String,Object>> list = repo.findAll();
		System.out.println(list);
		
		for(Map<String,Object> map : list)
		{
			System.out.println(map);
		}
*/
		/** Test-Case : findCityWise() **/
/*		List<Map<String,Object>> list = repo.findCityWise("PUNE");
		System.out.println(list);
*/
		
		
	}
	

}
