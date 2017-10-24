package com.prl.listeners;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class MethodInvoker implements IMethodInterceptor{

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		
		List<IMethodInstance> methodList = new ArrayList<>();
		
		for(IMethodInstance m : methods)	{
			Test test = m.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
			Set<String> groups = new HashSet<>();
			for(String group : test.groups())	{
				groups.add(group);
			}
			if(groups.contains("group1"))	{
				methodList.add(0,m);
			}else	{
				methodList.add(m);
			}
		}
		return methodList;
	}	
	

}
