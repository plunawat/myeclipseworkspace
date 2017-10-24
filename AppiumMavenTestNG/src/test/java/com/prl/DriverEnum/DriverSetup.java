package com.prl.DriverEnum;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public interface DriverSetup {
	
	WebDriver getWebDriverObject(DesiredCapabilities capabilities,String remoteAddress);
}
