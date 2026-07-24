package com.tca.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailService 
{
	@Value("${smtp.host}")
	private String smtpHost;   // Simple Mail Transfer Protocol
	
	@Value("${smtp.port}")
	private int  smtpPort;
	
	@Value("${to.address}")
	private String toAddress;
	
	@Value("${from.address:noreply@gmail.com}")
	private String fromAddress;
	
	
	public void sendMail()
	{
		System.out.print("Email Sent to : " + toAddress +" --> ");
		System.out.println("From : " + fromAddress + " via : " + smtpHost + " : " + smtpPort);
	}
	
}
