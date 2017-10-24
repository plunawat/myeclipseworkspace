package com.prl.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getTestContext().getName() + " has startedddd");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getTestContext().getName() + " is Passeddddd");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getTestContext().getName() + " is Failedddddd");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Finished Execution............");
	}

}
