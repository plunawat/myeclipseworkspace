package com.prl;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass1 {

	private WebDriver driver;

	@BeforeSuite
	public void initiateDriver() throws IOException {

		Runtime.getRuntime().exec("Taskkill /IM chromedriver.exe /F");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().getCookies();
		driver.findElement(By.id(""));
	}

	@Test
	public void testMethod1() throws InterruptedException {
		driver.get("file:///C:/Users/parikshit/workspace/HTMLPages/DelayElementAdded.html");
		PageObjectModel pom1 = new PageObjectModel(driver);
		System.out.println(pom1.getCellValue());
	}
	
	@Test
	public void testMethod2()	{
		
		
		
	}

	@AfterSuite
	public void quitDriver() {
		//driver.quit();
	}
}
