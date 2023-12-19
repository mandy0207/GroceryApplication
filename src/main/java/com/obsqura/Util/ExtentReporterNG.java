package com.obsqura.Util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.obsqura.constants.Constants;

public class ExtentReporterNG {

	
	public static ExtentReports getReporter() {
		ExtentSparkReporter reporter= new ExtentSparkReporter(Constants.EXTENTREPORTPATH);
		reporter.config().setReportName("Grocery Application");
		reporter.config().setDocumentTitle("Test Results");
	    ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Automation QA", "Jasna Alexis");
		extent.setSystemInfo("Environment", "QA");
		return extent;
	}
}
