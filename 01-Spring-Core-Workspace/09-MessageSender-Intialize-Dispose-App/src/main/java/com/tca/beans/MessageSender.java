package com.tca.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageSender  implements InitializingBean, DisposableBean
{
	private String serverIp;
	private int  serverPort;
	
	public void setServerIp(String serverIp) 
	{
		this.serverIp = serverIp;
		System.out.println("Server IP is Set : " + serverIp);
	}
	
	public void setServerPort(int serverPort) 
	{
		this.serverPort = serverPort;
		System.out.println("Server Port is Set : " + serverPort);
	}
	
	public void send() 
	{
		System.out.println("Sending the Message !");
	}
	
	/** Using Interface */
	
	@Override
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("Connecting to the Server [" + serverIp + "] " + "with Port" + " [" + serverPort + "]");
	}
	
	@Override
	public void destroy() throws Exception 
	{
		System.out.println("Dis-Connecting to the Server [" + serverIp + "] " + "with Port" + " [" + serverPort + "]");
	}
	
	
	/** Using Custom Method for Bean Creation & Destruction */
	
	public void myInit() 
	{
		System.out.println("Custom-Method Init -> Connecting to the Server [" + serverIp + "] " + "with Port" + " [" + serverPort + "]");
	}
	
	public void myDestroy()  
	{
		System.out.println("Custom-Method Destroy -> Dis-Connecting to the Server [" + serverIp + "] " + "with Port" + " [" + serverPort + "]");
	}
	

}
