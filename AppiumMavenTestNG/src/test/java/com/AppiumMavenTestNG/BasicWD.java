package com.AppiumMavenTestNG;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.prl.DriverFactory.DriverFactoryClass;

public class BasicWD extends DriverFactoryClass{
	
	@Test()	
	public void Test1() throws Exception {
		@SuppressWarnings("unused")
		WebDriver driver = DriverFactoryClass.getDriver();
	}
}
