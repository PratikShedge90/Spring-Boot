package com.tca.beans;

public class PdfReportCreator implements ReportCreator {

	@Override
	public void createReport() 
	{
		System.out.println("PdfReportCreator : Generating Reports !!");
	}

}
