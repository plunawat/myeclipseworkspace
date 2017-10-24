package com.prl;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.listeners.MyListener.class)
public class XYZ {
	
	@Test()
	public void Test_1()	{
		Assert.assertEquals(1,1);
	}
	
	@Test(dependsOnMethods={"Test_1"},alwaysRun=true)
	public void Test_2() throws InterruptedException	{
		
		Assert.assertTrue(true);
	}

}

