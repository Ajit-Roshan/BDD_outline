package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Defined_Steps_2 {
	
	@Given("we open the link")
	public void we_open_the_link() {
		System.out.println("scenario outline given");
	}

	@When("data entered  {string} and {string}")
	public void data_entered_and(String name, String pass) {
		System.out.println("name is ----- "+name+" pass is ----- "+pass);
	}

	@And("hit enter")
	public void hit_enter() {
		System.out.println("hit enter scenario Outline");
	}

	@Then("for valid login Crad we get logged in")
	public void for_valid_login_crad_we_get_logged_in() {
		System.out.println("than from scenario outline");
	}
	
}
