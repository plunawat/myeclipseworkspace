package com.pom.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenerateDataTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\PRL\\Study\\Libraries\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.generatedata.com/");
		
		WebElement myRow = driver.findElement(By.cssSelector("ul#gdTableRows > li:nth-child(1)"));
		WebElement myCol = myRow.findElement(By.cssSelector("li:nth-child(3) > select"));
		
		Select s1 = new Select(myCol);
		
		List<WebElement> listElement = s1.getOptions();
		for(WebElement el : listElement)	{
			System.out.println(el.getText());
		}
		
	}

}
