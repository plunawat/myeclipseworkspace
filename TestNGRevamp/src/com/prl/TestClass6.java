package com.prl;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TestClass6 {
	
	@Test(priority=1)
	public void testMethod1()	{
		System.out.println("Test Method 1 is executed");
	}
	
	@Test(priority=2)
	public void testMethod3()	{
		System.out.println("Test Method 3 is executed");
	}
	
	@Test(priority=3)
	public void testMethod5()	{
		System.out.println("Test Method 5 is executed");
	}
	
	@Test(priority=4)
	public void testMethod4()	{
		System.out.println("Test Method 4 is executed");
	}
	
	@Test(priority=5)
	public void testMethod2()	{
		System.out.println("Test Method 2 is executed");
	}

}
