package com.obsqura.Listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.obsqura.Utils.ExtentReporterNG;
import com.obsqura.test.BaseTest;

public class ReportListener extends BaseTest implements ITestListener{

	ExtentReports extent=ExtentReporterNG.getReporter();
	ExtentTest test;
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();   
	
	@Override
	public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
        extentTest.set(test);  
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.get().pass("Test Passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.get().fail(result.getThrowable());
	try {
		driver = (WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
	} catch (Exception e) {
		e.printStackTrace();
	}
	String filePath = null;
	try {
		filePath = getScreenshot(result.getMethod().getMethodName(), driver);
	} catch (IOException e) {
		e.printStackTrace();
	}
	extentTest.get().addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
	}
	
	@Override
	public void onFinish(ITestContext context) {
	     extent.flush();
	}

	
}
