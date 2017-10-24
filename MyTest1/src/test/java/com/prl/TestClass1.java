package com.prl;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestClass1 {
	
	private int p1;
	
	/*@Factory(dataProvider="dprovider")
	public TestClass1(int p1) {
		this.p1 = p1;
	}*/
	
	@DataProvider(name="dprovider")
	public Object[][] factory2()	{
		return new Object[][]{{"30"},{"40"}};
	}
	
	@Test(dataProvider="dprovider")
	public void testMethod1(String s1)	{
		System.out.println("Test Method 1 executed - " + s1);
	}
	
	@Test(dataProvider="dprovider")
	public void testMethod2(String s1)	{
		System.out.println("Test Method 2 executed - " + s1);
	}

}
