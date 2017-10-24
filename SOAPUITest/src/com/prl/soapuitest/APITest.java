package com.prl.soapuitest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.xmlbeans.XmlException;
import org.testng.annotations.Factory;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestSuite;
import com.eviware.soapui.support.SoapUIException;

public class APITest {
	
	
	@Factory
	public Object[] generateTests() throws XmlException, IOException, SoapUIException	{
		List<Object> l1 = new ArrayList<>();
		
		WsdlProject project = new WsdlProject("C:/PRL/Study/USZipCodeSOAP-soapui-project.xml");
		List<TestSuite> testSuiteList = project.getTestSuiteList();
		for (TestSuite ts : testSuiteList) {
			System.out.println("****Running Test suite " + ts.getName() + "********");

			// Retrieve all TestCases from a particular TestSuite
			List<TestCase> testCaseList = ts.getTestCaseList();

			// Iterate all TestCases of the particular TestSuite
			for (TestCase testcase : testCaseList) {
					l1.add(new TestCreator(testcase));
			}
		}
		return l1.toArray(new Object[]{});	
	}
}
