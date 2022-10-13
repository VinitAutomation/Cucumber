package stepDefinition;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fetch_Test_Data {

	
//	@Given("^user is on login page$")
//	public void user_is_on_login_page() {
//	   Assert.assertTrue(true);
//	}

	@When("^title of login testdata$")
	public void title_of_login(DataTable data) {
		List<String> listString = data.rows(1).asList();
		 //= dataStr;
		//System.out.println(listString.get(1));
		
		for (String str: listString) {
			System.out.println(str);
		}
		
//		 dataStr = data.rows(1);
//		List<String> listString1 = dataStr.asList();
//		System.out.println(listString1.get(1));
		
//		for (String str: listString1) {
//			System.out.println(str);
//		}
		
		
		Assert.assertTrue(true);
	}

//	@Then("^verify Home page title$")
//	public void verify_Home_page_title() {
//		Assert.assertTrue(true);
//	}
	
//	@Then("^verify Home page text$")
//	public void verify_Home_pagetext() {
//		Assert.assertTrue(true);
//	}
}
