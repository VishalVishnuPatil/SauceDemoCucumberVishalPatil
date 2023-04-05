package aero;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AcceptInput {
	
	
	@Given("user Login")
	public void user_Login() {
		System.out.println("Opening a page");
	   
	}

	@Given("accept the value (.*) and (.*) fill the value")
	public void accept_the_value_ab_and_ans_fill_the_value(String user,String pass) {
	    System.out.println("================"+user+"=============="+pass);
	}

	@Then("Verify user is registered")
	public void verify_user_is_registered() {
		System.out.println("Verify the registered user");
	   
	}

	



}
