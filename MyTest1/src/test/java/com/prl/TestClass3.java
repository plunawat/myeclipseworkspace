package com.prl;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners({com.prl.ListenerTest.class})
public class TestClass3 {
	
	@Test
	public void testMethod1()	{
		System.out.println("Test Class 3 method 1 executed");
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void testMethod2()	{
		System.out.println("Test Class 3  method 2 executed");
		Assert.assertEquals(true, true);
	}

}
