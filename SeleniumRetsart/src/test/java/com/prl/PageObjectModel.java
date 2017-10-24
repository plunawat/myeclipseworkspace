package com.prl;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {

	@FindBy(id = "li1")
	@CacheLookup
	private List<WebElement> tr1;

	private WebDriver driver;

	public PageObjectModel(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public String getCellValue() {

		for (WebElement el : tr1) {
			System.out.println(el.getText());
		}

		return "abc";
	}
}
