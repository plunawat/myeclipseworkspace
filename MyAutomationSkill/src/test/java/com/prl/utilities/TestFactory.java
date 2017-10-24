package com.prl.utilities;

import org.testng.annotations.Factory;

import com.prl.tests.TestClass1;

public class TestFactory {
	
	@Factory
	public Object[] MultiBrowser()	{
		return new Object[]{new TestClass1("CHROME"),new TestClass1("FIREFOX")};
	}

}
