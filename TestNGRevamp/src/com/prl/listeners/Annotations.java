package com.prl.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.ITestAnnotation;

import com.prl.dataprovider.ReadTestSuite;

public class Annotations implements IAnnotationTransformer {
	
	Map<String,List<String>> excelTable;
	
	@BeforeSuite
	public void initializeTestreader()	{
		
	}

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		ReadTestSuite rts = new ReadTestSuite();
		excelTable = rts.readExcel();
		
		for(String str : excelTable.keySet())	{
			if(testMethod.getName().equals(str) )	{
				String str2 = excelTable.get(str).get(0);
				if(str2.equals("No"))	{
					annotation.setEnabled(false);
				}
			}
		}	
	}
}
