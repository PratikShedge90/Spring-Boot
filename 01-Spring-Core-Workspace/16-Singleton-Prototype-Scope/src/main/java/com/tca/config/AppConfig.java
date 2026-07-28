package com.tca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tca.beans.ServiceB;

@Configuration
@ComponentScan("com.tca")
public class AppConfig 
{
	
	@Bean("serB")
	public ServiceB serviceB()		// This Bean Name will be 'getb'
	{
		System.out.println("Bean Method");
		return new ServiceB();				
		
		/** When There are Trying to Two Bean Objects 1st with @Component & Other with @Bean Method
		 *  then SC Prioritizes @Bean Object & Creates Object rather than creating Object with
		 *   @Component Annotation  */
		
	}

}
