package aero;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectProduct {

	@Given("login into application")
	public void login_into_application() {
		System.out.println("---------------------");
	    
	}

	@When("Click on product with Name as {string} on product page")
	public void click_on_product_with_Name_as_on_product_page(String productName) {
		System.out.println(productName);
	    
	}

	@Then("product page should open")
	public void product_page_should_open() {
	   
	}

	@Then("add it to cart")
	public void add_it_to_cart() {
	    
	}

	@Then("verify product is added to cart")
	public void verify_product_is_added_to_cart() {
	    
	}

	@Then("click on product and come back")
	public void click_on_product_and_come_back(io.cucumber.datatable.DataTable dataTable) {
	   
		List<Map<String, String >>  reciveddata= dataTable.asMaps(String.class,String.class);
		
		System.out.println(reciveddata);
		System.out.println("====================================");
		System.out.println(reciveddata.get(0).get("id"));
		System.out.println(reciveddata.get(0).get("name of Product"));
		System.out.println(reciveddata.get(0).get("details"));
		
		
		System.out.println(reciveddata.get(1).get("id"));
		System.out.println(reciveddata.get(1).get("name of Product"));
		System.out.println(reciveddata.get(1).get("details"));
		
	}


}
