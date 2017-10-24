package com.pom.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// Getting started: http://docs.seleniumhq.org/docs/03_webdriver.jsp
// API details: https://github.com/SeleniumHQ/selenium#selenium 

// Unirest is the recommended way to interact with RESTful APIs in Java
// http://unirest.io/java.html

// runs test against http://crossbrowsertesting.github.io/selenium_example_page.html


import java.net.URL;
import java.nio.file.Path;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BasicTest {

    static String username = "parikshit.lunawat%40altimetrik.com"; // Your username
    static String authkey = "u34b63c2b414c30e";  // Your authkey
    String testScore = "unset";

    public static void main(String[] args) throws Exception {
        BasicTest myTest = new BasicTest();

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("name", "Basic Example");
        caps.setCapability("build", "1.0");
        caps.setCapability("browser_api_name", "IE10");
        caps.setCapability("os_api_name", "Win7x64-C2");
        caps.setCapability("screen_resolution", "1024x768");
        caps.setCapability("record_video", "true");
        caps.setCapability("record_network", "true");

        
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://" + username + ":" + authkey +"@hub.crossbrowsertesting.com:80/wd/hub"), caps);
        System.out.println(driver.getSessionId());
        
        driver.get("https://www.seleniumeasy.com/selenium-tutorials");
        System.out.println(driver.getTitle());
        
        File f1 = driver.getScreenshotAs(OutputType.FILE);
        File f2 = new File("C:\\PRL\\Study\\abc.jpg");
        
        
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(f1);
            os = new FileOutputStream(f2);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
        
    }
}