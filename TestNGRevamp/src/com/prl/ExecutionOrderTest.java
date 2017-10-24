package com.prl;

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

@Test(groups={"A1"})
public class ExecutionOrderTest {
	
	@BeforeSuite
	public void beforeSuite()	{
		System.out.println("Before Suite Method is executed");
	}
	
	@AfterSuite
	public void afterSuite()	{
		System.out.println("After Suite Method is executed");
	}
	
	@BeforeTest
	public void beforeTest()	{
		System.out.println("Before Test Method is executed");
	}
	
	@AfterTest
	public void afterTest()	{
		System.out.println("After Test Method is executed");
	}
	
	@BeforeGroups("A1")
	public void beforeGroups()	{
		System.out.println("Before Groups Method is executed");
	}
	
	@AfterGroups("A1")
	public void afterGroups()	{
		System.out.println("After Groups Method is executed");
	}
	@BeforeClass
	public void beforeClass()	{
		System.out.println("Before Class Method is executed");
	}
	
	@AfterClass
	public void afterClass()	{
		System.out.println("After Class Method is executed");
	}
	
	@AfterMethod
	public void afterMethod()	{
		System.out.println("After Method Method is executed");
	}
	@BeforeMethod
	public void beforeMethod()	{
		System.out.println("Before Method Method is executed");
	}
	
	@Test(dependsOnMethods={"Test2"})
	public void Test1()	{
		System.out.println("-- Test Method is executed--");
	}

}
