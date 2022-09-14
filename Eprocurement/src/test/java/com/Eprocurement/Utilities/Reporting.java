package com.Eprocurement.Utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;



public class Reporting extends captureScreenshot implements ITestListener {
	

	public void onTestFailure(ITestResult Result) {
		
		System.out.println("Test failed - Screenshot captured");
		
		try {
			
			getScreenshot();
			
		} catch (IOException e) { 
	
			e.printStackTrace();
			
		}
		
		System.setProperty("org.uncommons.reporng.escape-output", "false");
	}



	public void onTestSkipped(ITestResult Result) {

		Reporter.log("The name of the skipped testcase is :" + Result.getName());
	}

	
	public void onTestStart(ITestResult Result) {

		Reporter.log("Test Starting - " + Result.getName());
		
	}

	

	public void onTestSuccess(ITestResult Result) {

		Reporter.log("Status of execution is - " + Result.getStatus());
	}

}
