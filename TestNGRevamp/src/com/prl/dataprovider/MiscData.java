package com.prl.dataprovider;

import org.testng.annotations.DataProvider;

public class MiscData {
	
	@DataProvider(name="data1")
	public static Object[][] data12()	{
		Object[][] obj1 =  new Object[1][1];
		
		
		return new Object[][] {
		      new Object[] { new Integer(42) },
		      new Object[] { new Integer(43) }
		    };

	}

}
