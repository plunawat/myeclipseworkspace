package com.prl.DriverFactory;

import static com.prl.DriverEnum.DriverType.CHROME;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.prl.DriverEnum.DriverType;
import com.prl.utilities.ReadProperties;

public class WebDriverThread {
	
	private WebDriver webdriver;
	private DriverType selectedDrivertype;
	private final DriverType defaultDriverType = CHROME;
	private final String browser = System.getProperty("browser").toUpperCase();
	private final String remoteAddress = System.getProperty("remoteAddress");
	
	 
	
	public WebDriver getDriver() {
		if(webdriver == null)	{
			selectedDrivertype = determineEffectiveDriverType();
			webdriver = selectedDrivertype.getWebDriverObject(getDesiredCapabilities(),remoteAddress);
		}
		return webdriver;	
	}
	
	private DriverType determineEffectiveDriverType()	{
		
		DriverType drivertype = null;
		try	{
			drivertype = DriverType.valueOf(browser);
		}
		catch(IllegalArgumentException iae)	{
			System.out.println("Invalid driver type specified");
		}
		catch(NullPointerException npe)	{
			System.out.println("No driver type specified");
		}
		return drivertype;
	}
	
	private DesiredCapabilities getDesiredCapabilities()	{
		String capabilityFile = browser.concat("Capabilities.properties");
		Properties desiredProperties = ReadProperties.getPropValues(capabilityFile);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		for(Map.Entry<Object, Object> entry : desiredProperties.entrySet())	{
			String key = entry.getKey().toString();
			String value = entry.getValue().toString();
			if(!key.startsWith("[-?/]"))	{
				capabilities.setCapability(entry.getKey().toString(), entry.getValue().toString());
			}
			
		}
		return capabilities;
	}
	
	public void quitDriver() {
		if (null != webdriver) {
			webdriver.quit();
		}
	}
}
