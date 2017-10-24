package com.pom.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MiscTest1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\PRL\\Study\\Libraries\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--user-data-dir=C:/Users/parikshit/AppData/Local/Google/Chrome/User Data");
		ChromeDriver driver = new ChromeDriver(co);
		//driver.get("file:///C:/Users/parikshit/workspace/HTMLPages/MyBookList.html");
		driver.get("https://www.cacert.org/");
		/*
		WebElement el = driver.findElement(By.id("book_1"));
		System.out.println(el.findElement(By.xpath("//td[1]")).getText());
		System.out.println(el.findElement(By.cssSelector("td:nth-child(1)")).getText());
		
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.quit();
		
		/*
		driver.get("http://www.generatedata.com/");
		Select s1 = new Select(driver.findElement(By.cssSelector("select[name='gdDataType_1']")));
		List<WebElement> l1 = s1.getOptions();
		for(WebElement l2 : l1)	{
			System.out.println(l2.getText());
		}
		*/
		
		
	}

}
