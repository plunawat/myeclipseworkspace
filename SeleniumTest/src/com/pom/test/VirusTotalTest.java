package com.pom.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VirusTotalTest {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.virustotal.com/");
		
		
		List<WebElement> tabEl = driver.findElements(By.cssSelector("ul#action-options li"));
		
		for(int i=0;i<2 ; i++)	{
			for(WebElement el : tabEl)	{
				el.click();
				driver.findElement(By.cssSelector("input#file-choosen")).sendKeys("C:\\fromUSB\\ICICI Meal Card - Sample Form2016.pdf");
				Thread.sleep(3000);
			}
		}	
	}
}
