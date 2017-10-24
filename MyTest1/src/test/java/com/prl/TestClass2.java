package com.prl;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test
public class TestClass2 {
	
	@BeforeGroups
	public void abc()	{
		
	}

	@AfterTest
	public void letsSee()	{
		System.out.println("hmmmmmmm");
	}
	public void testMethod1()	{
		System.out.println("Test Class 2 method 1 executed");
		Assert.assertEquals(true, true);
	}
	
	public void testMethod2()	{
		System.out.println("Test Class 2  method 2 executed");
		Assert.assertEquals(true, true);
	}
}
