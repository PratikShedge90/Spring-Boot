package com.tca.beans;

public class ReportManager // Dependent class
{
	ReportCreator reportCreator;
	
	public ReportManager(ReportCreator reportCreator) // Dependency Object will Inject Here
	{
		this.reportCreator=reportCreator;
		System.out.println("********** CONSTRUCTOR INJECTION *********");
	}
	
	
//	public void setReportCreator(ReportCreator reportCreator) // Dependency Object will Inject Here
//	{
//		this.reportCreator = reportCreator;
//		System.out.println("######## SETTER INJECTION #########");
//		
//	}
	
	public void printReport()
	{
		reportCreator.createReport();
	}

}
