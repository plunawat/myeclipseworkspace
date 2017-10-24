package com.prl.DriverEnum;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public enum DriverType implements DriverSetup {
	
	CHROME	{

		public WebDriver getWebDriverObject(DesiredCapabilities capabilities, String remoteAddress) {
			return new ChromeDriver(capabilities);
		}
	},
	
	FIREFOX	{

		public WebDriver getWebDriverObject(DesiredCapabilities capabilities, String remoteAddress) {
			return new FirefoxDriver();
		}
	},
	ANDROID	{

		public WebDriver getWebDriverObject(DesiredCapabilities capabilities, String remoteAddress) {
			try {
				
				AppiumServiceBuilder builder = new AppiumServiceBuilder();
				builder.withCapabilities(capabilities);
				AppiumDriverLocalService service = builder.build();
				service.start();
				
				return new AndroidDriver<WebElement>(new URL(remoteAddress), capabilities);
				
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			return null;
		}
	}

}
