package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Defined_Steps {

	@Given("user on search page")
	public void user_on_search_page() {
		System.out.println("google search given");
	}

	@And("enter the search data")
	public void enter_the_search_data() {
		System.out.println("google search and");
	}

	@When("user hit enter")
	public void user_hit_enter() {
		System.out.println("google search when");
	}

	@Then("user is redirect to search result page")
	public void user_is_redirect_to_search_result_page() {
		System.out.println("google search then");
	}

	///	

	@Given("user on demo login page")
	public void user_on_demo_login_page() {
		System.out.println("demo login page");
	}

	@And("enter the user id and password")
	public void enter_the_user_id_and_password() {
		System.out.println("and enter login id and password");
	}

	@When("user click on login")
	public void user_click_on_login() {
		System.out.println("demo login when");
	}

	@Then("user shuld get loggedIN")
	public void user_shuld_get_logged_in() {
		System.out.println("demp login Then");
	}

	///

	@Given("user should be on ornage hrm home page")
	public void user_should_be_on_ornage_hrm_home_page() {
		System.out.println("ornage hrm login page ");
	}

	@When("user input ligin ID and Password")
	public void user_input_ligin_id_and_password() {
		System.out.println("ornage hrm when");
	}

	@And("click on ligin")
	public void click_on_ligin() {
		System.out.println("ornage hrm and");
	}

	@Then("user should be login page")
	public void user_should_be_login_page() {
		System.out.println("ornage then");
	}


}
