package com.prl;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyClass3 {
	
	String str;
	
	//@Parameters({"param1"})
	public MyClass3(String str)	{
		this.str=str;
	}
	
	@Test//dependsOnMethods={"masterMethod"},description="Best method")
	public void TestMethod1()	{
		System.out.println("Dependent Method executed: "+str);
	}
	
	@Test
	public void masterMethod()	{
		System.out.println("Master Method executed: "+str);
	}
}
