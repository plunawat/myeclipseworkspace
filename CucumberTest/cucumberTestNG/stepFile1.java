package cucumberTestNG;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepFile1 {
	
	private MyCalculator mc;
	private int i;
	
	
	@Given("User is accessing add api for calculator")
	public void given1()	{
		mc = new MyCalculator(100, 200);
	}
	
	@When("user provides (.*) and (.*)")
	public void when1(int s1,int s2)	{
		i = mc.add(Integer.valueOf(s1),Integer.valueOf(s2));
	}
	
	@Then("addition of two number is returned")
	public void then1()	{
		Assert.assertEquals(i, 300);
	}
}
