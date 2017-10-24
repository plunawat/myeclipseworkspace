package com.prl.listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class MyListener extends TestListenerAdapter {
	
	
	  @Override
	  public void onTestSuccess(ITestResult tr) {
	    System.out.println(tr.getMethod().getMethodName()+" is success");
	  }

	

}
