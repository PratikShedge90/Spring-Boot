package com.cdac.runners;

import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner 
{
	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
/*		
		List<String> L = args.getNonOptionArgs();
		
		if(L.isEmpty())
		{
			System.out.println("No Non-Options argument sent");
		}
		else
		{
			System.out.println("Non-Options Args List : " + L);
		}
*/		
		/** key can have Multiple Values i.e --admin.user=pratik --admin.user=som */
/*		if(args.containsOption("admin.user"))
		{
			List<String> L2 = args.getOptionValues("admin.user"); //[pratik,som]		
			System.out.println("Option Args List : " + L2);
		}
		else
		{
			System.out.println("No Admin-user Sent !");
		}
*/		
		/** Returns only the KEYS(names) of all Named(option) arguments as a Set */		
/*		Set<String> s = args.getOptionNames();
		System.out.println("Keys : " + s);
		
		for(String key : s)
		{
			System.out.println(key + "--> " + args.getOptionValues(key));
		}
	*/
		
		List<String> list = args.getOptionValues("server.port");
		
		System.out.println("Port : " + list.get(0));
	}
}
