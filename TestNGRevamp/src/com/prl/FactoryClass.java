package com.prl;

import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FactoryClass {
	
	@Factory
	public Object[] factMtd()	{
		return new Object[]{new MyClass3("String 1"),new MyClass3("String 2")};
	}

}
