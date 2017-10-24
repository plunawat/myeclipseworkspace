package com.prl.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

	private WebDriver driver;

	public static void checkPageReadyState(WebDriver driver) {

		new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver input) {
				JavascriptExecutor js = (JavascriptExecutor) input;
				return js.executeScript("return document.readyState").equals("complete");
			}

		});
	}
}
