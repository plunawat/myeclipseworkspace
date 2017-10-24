package com.prl.soapuitest;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestRunner;

@Test
public class TestCreator implements ITest {
	
	private String testName;
	private TestCase tc;
	
	public TestCreator(TestCase tc)	{
		this.tc = tc;
	}

	@Override
	public String getTestName() {
		// TODO Auto-generated method stub
		return tc.getName();
	}
	
	@BeforeMethod
	public void findMethodName(Method method) {
		
	}
	
	public void Test1()	{
		TestRunner testRunner = tc.run(new PropertiesMap(), false);
		// verify if test case is passed or failed.
		Assert.assertEquals(testRunner.getStatus(), TestRunner.Status.FINISHED);
	}

}
