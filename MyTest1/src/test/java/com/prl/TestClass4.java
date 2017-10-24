package com.prl;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestClass4 {

	public void testMethod1()	{
		System.out.println("Test Class 4 method 1 executed");
		Assert.assertEquals(true, true);
	}
	
	public void testMethod2()	{
		System.out.println("Test Class 4  method 2 executed");
		Assert.assertEquals(true, true);
	}
}