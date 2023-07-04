package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Defined_Steps {

	@Given("user on search page")
	public void user_on_search_page() {
		System.out.println("given");
	}

	@And("enter the search data")
	public void enter_the_search_data() {
		System.out.println("and");
	}

	@When("user hit enter")
	public void user_hit_enter() {
		System.out.println("when");
	}

	@Then("user is redirect to search result page")
	public void user_is_redirect_to_search_result_page() {
		System.out.println("then");
	}


}
