package com.prl;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners({com.prl.listeners.MyTestListener.class})
public class TestClass2 {
	
	/*@BeforeSuite
	public void beforeSuiteMethod1TestClass2(ITestContext cntx)	{
		System.out.println("Before suite method 1 from Test Class 2 is invoked...");
	}
	
	@AfterSuite
	public void afterSuiteMethod1TestClass2(ITestContext cntx)	{
		System.out.println("After suite method 1 from Test Class 2 is invoked...");
	}

	
	@BeforeTest
	public void beforeTestMethod1TestClass2()	{
		System.out.println("Before Test method 1 from Test Class 2 is invoked...");
	}
	
	@AfterTest
	public void afterTestMethod1TestClass2()	{
		System.out.println("After Test method 1 from Test Class 2 is invoked...");
	}
	
	@BeforeClass
	public void beforeClassMethod1TestClass2()	{
		System.out.println("Before Class method 1 from Test Class 2 is invoked...");
	}
	
	@AfterClass
	public void afterClassMethod1TestClass2()	{
		System.out.println("After Class method 1 from Test Class 2 is invoked...");
	}
	
	@BeforeMethod
	public void beforeMethodMethod1TestClass2()	{
		System.out.println("Before Method method 1 from Test Class 2 is invoked...");
	}
	
	@AfterMethod
	public void afterMethodMethod1TestClass2()	{
		System.out.println("After Method method 1 from Test Class 2 is invoked...");
	}*/
	
	
	@Test(groups= {"Group1Class2","Group2Class2"})
	public void testMethod1TestClass2()	{
		System.out.println("Test Method 1 from Test class 2 invoked");
		Assert.assertEquals(true, true);
	}
	
	@Test(groups= {"Group1Class2"})
	public void testMethod2TestClass2()	{
		System.out.println("Test Method 2 from Test class 2 invoked");
		Assert.assertEquals(true, true);
	}

}
