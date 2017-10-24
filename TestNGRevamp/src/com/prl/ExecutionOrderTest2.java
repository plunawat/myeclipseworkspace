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

@Test(groups={" 2 A1"})
public class ExecutionOrderTest2 {
	
	@BeforeSuite
	public void beforeSuite()	{
		System.out.println(" 2 Before Suite Method is executed");
	}
	
	@AfterSuite
	public void afterSuite()	{
		System.out.println(" 2 After Suite Method is executed");
	}
	
	@BeforeTest()
	public void beforeTest()	{
		System.out.println(" 2 Before Test Method is executed");
	}
	
	@AfterTest
	public void afterTest()	{
		System.out.println(" 2 After Test Method is executed");
	}
	
	@BeforeGroups(" 2 A1")
	public void beforeGroups()	{
		System.out.println(" 2 Before Groups Method is executed");
	}
	
	@AfterGroups(" 2 A1")
	public void afterGroups()	{
		System.out.println(" 2 After Groups Method is executed");
	}
	@BeforeClass
	public void beforeClass()	{
		System.out.println(" 2 Before Class Method is executed");
	}
	
	@AfterClass
	public void afterClass()	{
		System.out.println(" 2 After Class Method is executed");
	}
	
	@AfterMethod
	public void afterMethod()	{
		System.out.println(" 2 After Method Method is executed");
	}
	@BeforeMethod
	public void beforeMethod()	{
		System.out.println(" 2 Before Method Method is executed");
	}
	
	@Test
	public void Test2()	{
		System.out.println("-- Test Method is executed--");
	}

}
