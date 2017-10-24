package com.prl;

import org.testng.ITestContext;		
import org.testng.ITestListener;		
import org.testng.ITestResult;		

public class ListenerTest implements ITestListener						
{

	public void onTestStart(ITestResult result) {
		System.out.println("Teeeeeeeeeeest");	
	}

	public void onTestSuccess(ITestResult result) {
		//System.out.println("Done ");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Test start ");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Done ");
	}			
}		