package com.prl;

import org.testng.annotations.Factory;

public class FactoryClass {
	
	@Factory
	public Object[] MyFactory()	{
		return new Object[] {new TestClass4(),new TestClass2()};
	}

}
