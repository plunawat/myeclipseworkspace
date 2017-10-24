package com.prl.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.prl.poms.LoginStart;
import com.prl.poms.UserLandingPage;
import com.prl.utilities.Utilities;

public class TestClass1 {

	private WebDriver driver;
	final private String BROWSER;

	public TestClass1(String str) {
		BROWSER = str;
	}

	@BeforeClass
	public void initializeDriver() throws IOException {
		// Runtime.getRuntime().exec("Taskkill /IM chromedriver.exe /F");
		switch (BROWSER) {
		
		case "CHROME":
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			driver = new ChromeDriver(options);
			break;
		case "FIREFOX":
			driver = new FirefoxDriver();
			break;
		}

	}

	@Test
	public void test1001() {
		driver.get("http://rhel65:10000/unica/jsp/frameworklogin.jsp");
		driver.manage().window().maximize();
		LoginStart loginStart = new LoginStart(driver);
		loginStart.enterUserName("asm_admin").enterPassword("Qwerty$007").clickLogin();
		assertEquals("IBM - Users", driver.getTitle());
	}

	@Test(dependsOnMethods = { "test1001" })
	public void test1002() {
		Utilities.checkPageReadyState(driver);
		UserLandingPage userLP = new UserLandingPage(driver);
		userLP.clickLogOut();
	}

	@AfterMethod
	public void cleanUp() {
		System.gc();
	}

	@AfterClass
	public void quitWebDriver() {
		driver.quit();
	}
}
