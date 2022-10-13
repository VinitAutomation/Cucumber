package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_StepDefinition {
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
	   Assert.assertTrue(true);
	}

	@When("^title of login \"(.*)\"$")
	public void title_of_login(String str) {
		System.out.println(str);
		Assert.assertTrue(true);
	}

	@Then("^verify Home page title$")
	public void verify_Home_page_title() {
		Assert.assertTrue(true);
	}
	
	@Then("^verify Home page text$")
	public void verify_Home_pagetext() {
		Assert.assertTrue(true);
	}

}
