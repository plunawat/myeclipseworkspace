package com.prl.listeners;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

public class MyMethodInterceptor implements IMethodInterceptor {

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		
		List<IMethodInstance> l1 = new ArrayList<>();
		
		
		for(IMethodInstance im : methods)	{
			if(im.getMethod().getPriority()==1)
			l1.add(im);
		}
		
		
	
		
		Collections.sort(methods,new Comparator<IMethodInstance>() {

			@Override
			public int compare(IMethodInstance o1, IMethodInstance o2) {
				// TODO Auto-generated method stub
				return (-1)*o1.getMethod().getMethodName().compareToIgnoreCase(o2.getMethod().getMethodName());
			}
			
		});
		
		return methods;
	}

}
