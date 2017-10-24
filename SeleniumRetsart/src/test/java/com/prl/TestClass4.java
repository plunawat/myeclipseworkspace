package com.prl;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass4 {

	@BeforeSuite
	public void beforeSuiteMethod1TestClass4(ITestContext cntx) {

		System.out.println("Before suite method 1 from Test Class 4 is invoked...");
	}

	@AfterSuite
	public void afterSuiteMethod1TestClass4(ITestContext cntx) {

		System.out.println("After suite method 1 from Test Class 4 is invoked...");
	}

	@BeforeTest
	public void beforeTestMethod1TestClass4(ITestContext cntx) {

		System.out.println("Before Test method 1 from Test Class 4 is invoked...");
	}

	@AfterTest
	public void afterTestMethod1TestClass4(ITestContext cntx) {

		System.out.println("After Test method 1 from Test Class 4 is invoked...");
	}
	
	@BeforeClass
	public void beforeClassMethod1TestClass4() {
		System.out.println("Before Class method 1 from Test Class 4 is invoked...");
	}

	@AfterClass
	public void afterClassMethod1TestClass4() {
		System.out.println("After Class method 1 from Test Class 4 is invoked...");
	}
	
/*	@BeforeGroups(groups= {"Group1Class2"})
	public void beforeGroupMehtod1Calss4()	{
		System.out.println("Before Group method 1 from Test Class 4 is invoked...");
	}
	
	@AfterGroups(groups= {"Group1Class2"})
	public void afterGroupMehtod1Calss4()	{
		System.out.println("After Group method 1 from Test Class 4 is invoked...");
	}*/

/*	@BeforeMethod
	public void beforeMethodMethod1TestClass4() {
		System.out.println("Before Method method 1 from Test Class 4 is invoked...");
	}
	
	@AfterMethod
	public void afterMethodMethod1TestClass4() {
		System.out.println("After Method method 1 from Test Class 4 is invoked...");
	}*/
	

	@Test(groups= {"Group1"})
	public void testMethod1TestClass4() {
		System.out.println("Test Method 1 from Test class 4 invoked");
	}
}
