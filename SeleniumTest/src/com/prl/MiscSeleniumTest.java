package com.prl;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class MiscSeleniumTest {

	public static void main(String[] args) throws IOException {
		
	/*	System.setProperty("webdriver.chrome.driver", "C:/PRL/Study/Libraries/ChromeDriver/chromedriver.exe");
		
		Runtime.getRuntime().exec("Taskkill /IM chromedriver.exe /F");*/
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
		driver.get("https://www.google.co.in");
	}

}
