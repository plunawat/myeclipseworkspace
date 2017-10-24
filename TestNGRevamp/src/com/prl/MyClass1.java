package com.prl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


public class MyClass1 {

	
	@Test(groups={"group1"},priority=1)
	public void testMethod1()	{
		Assert.assertEquals(1,2,"This is success");
	}
	
	
	
	@Test(groups={"group1"},priority=0)
	public void testMethod6()	{
		System.out.println("Test Method 6 is executed");
	}

	
}
