package com.prl;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass3 {
	
	/*@BeforeSuite
	public void beforeSuiteMethod1TestClass3(ITestContext cntx) {
		
		System.out.println("Before suite method 1 from Test Class 3 is invoked...");
	}
	
	@AfterSuite
	public void afterSuiteMethod1TestClass3(ITestContext cntx) {
		
		System.out.println("After suite method 1 from Test Class 3 is invoked...");
	}
	
	@BeforeClass
	public void beforeClassMethod1TestClass3() {
		System.out.println("Before Class method 1 from Test Class 3 is invoked...");
	}

	@AfterClass
	public void afterClassMethod1TestClass3() {
		System.out.println("After Class method 1 from Test Class 3 is invoked...");
	}
	
	@BeforeTest
	public void beforeTestMethod1TestClass3()	{
		System.out.println("Before Test method 1 from Test Class 3 is invoked...");
	}
	
	@AfterTest
	public void afterTestMethod1TestClass3()	{
		System.out.println("After Test method 1 from Test Class 3 is invoked...");
	}*/
	
	
	@Test(groups= {"Group1"})
	public void testMethod1TestClass3()	{
		System.out.println("Test Method 1 from Test class 3 invoked...");
	}
	
	@Test(dependsOnMethods= {"testMethod1TestClass3"})
	public void testMethod2TestClass3()	{
		System.out.println("Test Method 2 from Test class 3 invoked...");
	}
	
	/*@BeforeMethod
	public void beforeMethodMethod1TestClass3()	{
		System.out.println("Before Method method 1 from Test Class 3 is invoked...");
	}
	
	@AfterMethod
	public void afterMethodMethod1TestClass3()	{
		System.out.println("After Method method 1 from Test Class 3 is invoked...");
	}*/
	
}
