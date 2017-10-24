package com.pom.test;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GridTest {

	public static void main(String[] args) throws MalformedURLException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\PRL\\Study\\Libraries\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("file:///C:/Users/parikshit/workspace/HTMLPages/DelayElementAdded.html");
		
		WebElement el = new WebDriverWait(driver,10).until(new ExpectedCondition<WebElement>() {

			@Override
			public WebElement apply(WebDriver arg0) {
					// TODO Auto-generated method stub
				return arg0.findElement(By.cssSelector("li:nth-child(3)"));
			}});
	}
}
