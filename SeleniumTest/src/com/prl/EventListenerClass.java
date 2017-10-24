package com.prl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class EventListenerClass extends AbstractWebDriverEventListener {
	
	@Override
	public void beforeNavigateTo(java.lang.String url,WebDriver driver)	{
		System.out.println("before method executed");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
