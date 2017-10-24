package com.prl.poms;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiscPomTest {
	
	@FindAll({
		@FindBy(css="tr:nth-child(2) > td:nth-child(1)"),
		@FindBy(css="tr:nth-child(3) > td:nth-child(1)"),
		@FindBy(css="tr:nth-child(4) > td:nth-child(1)")
	})
	private List<WebElement> list1;
	
	public MiscPomTest(WebDriver driver)	{
		PageFactory.initElements(driver, this);
	}
	
	public void printThings()	{
		System.out.println("Inside needed method");
		System.out.println(list1.size());
		for(WebElement el : list1)	{
			System.out.println(el.getText());
		}
	}
	
	
}
