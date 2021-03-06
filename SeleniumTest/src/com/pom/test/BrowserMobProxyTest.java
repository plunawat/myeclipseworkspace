/*package com.pom.test;
import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;

public class BrowserMobProxyTest {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\PRL\\Study\\Libraries\\ChromeDriver\\chromedriver.exe");
		
		BrowserMobProxy proxy = new BrowserMobProxyServer();
	    proxy.start(0);
	    
	    // get the Selenium proxy object
	    org.openqa.selenium.Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);

	    // configure it as a desired capability
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);

	    // start the browser up
	    WebDriver driver = new ChromeDriver(capabilities);

	    // enable more detailed HAR capture, if desired (see CaptureType for the complete list)
	    proxy.enableHarCaptureTypes(CaptureType.RESPONSE_HEADERS, CaptureType.REQUEST_HEADERS);

	    // create a new HAR with the label "yahoo.com"
	    proxy.newHar("Google");

	    // open yahoo.com
	    driver.get("https://www.google.co.in");

	    // get the HAR data
	    Har har = proxy.getHar();
	    Map<String,String> map1 = ((BrowserMobProxyServer)proxy).getAllHeaders();
	    for(Map.Entry<String,String> entry : map1.entrySet())	{
	    	System.out.println(entry.getKey()+"--"+entry.getValue());
	    }
	    File harFile = new File("C:\\PRL\\abc.txt");
	    if(!harFile.exists()){
	    	harFile.createNewFile();
	    }
		try {
			har.writeTo(harFile);
		} catch (IOException ex) {
			 System.out.println (ex.toString());
		    // System.out.println("Could not find file " + sFileName);
		}	
	}
}
*/