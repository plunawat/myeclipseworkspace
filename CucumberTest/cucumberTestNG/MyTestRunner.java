package cucumberTestNG;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/features/MiscTest.feature","src/test/resources/features/MiscTest2.feature"},glue = "cucumberTestNG")
public class MyTestRunner extends AbstractTestNGCucumberTests {

}

/*

@CucumberOptions(features = "src/test/java/Features/MiscTest.feature",glue = "cucumberTestNG")
class MyTestRunner2 extends AbstractTestNGCucumberTests	{
	
}
*/