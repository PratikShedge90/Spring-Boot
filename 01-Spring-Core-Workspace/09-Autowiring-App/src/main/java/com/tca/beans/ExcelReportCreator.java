package com.tca.beans;

public class ExcelReportCreator implements ReportCreator {

	@Override
	public void createReport() 
	{
		System.out.println("ExcelReportCreator : Generating Reports !!");
	}

}
