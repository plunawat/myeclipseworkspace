package com.pom.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\PRL\\Study\\Libraries\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/parikshit/workspace/HTMLPages/DelayElement.html");
		
		long startTime = System.currentTimeMillis();
		
		//driver.findElement(By.xpath("//*[text()='some text']"));
		driver.findElement(By.xpath("//*[@class='show']"));
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total time taken: "+(endTime - startTime)/1000+" seconds!");
		
		driver.quit();
		
	}
}
