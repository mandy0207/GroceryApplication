package com.obsqura.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int counter=0;
	int retryLimit =2;
	
	
	@Override
	public boolean retry(ITestResult result) {
		if(counter<retryLimit) {
			counter++;
			return true;   //execute again
		}
		return false;   //do not execute
	}
	

}
