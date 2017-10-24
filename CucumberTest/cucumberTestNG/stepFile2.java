package cucumberTestNG;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepFile2 {
	
	private MyCalculator mc;
	private int i;
	
	@Given("User is accessing multiply api for calculator")
	public void given2()	{
		mc = new MyCalculator(100, 200);
	}
	
	@When("user provides two number to multiply")
	public void when2()	{
		i = mc.multiply();
	}
	
	@Then("multiplication of two number is returned")
	public void then2()	{
		Assert.assertEquals(i, 20000);
	}

}