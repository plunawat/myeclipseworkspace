package com.pom.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class POM extends LoadableComponent<POM> {
	
	@FindBy(css="input:nth-child(1)")
	@CacheLookup
	WebElement input1;
	
	public POM(WebDriver driver)	{
		PageFactory.initElements(driver, this);
	}

	public void setFirstField(String str)	{
		input1.sendKeys(str);
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}
}
