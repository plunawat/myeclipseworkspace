package com.prl.cucumberTestNG;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/features/MiscTest.feature"/*,"src/features/MiscTest2.feature"*/},
glue = "com.prl.cucumberTestNG",
dryRun=false,monochrome=false)
public class MyTestRunner extends AbstractTestNGCucumberTests {

}

/*

@CucumberOptions(features = "src/test/java/Features/MiscTest.feature",glue = "cucumberTestNG")
class MyTestRunner2 extends AbstractTestNGCucumberTests	{
	
}
*/
