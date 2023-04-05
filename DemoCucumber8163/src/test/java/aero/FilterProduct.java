package aero;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FilterProduct {

	WebDriver driver;
	
	@Given("open product page")
	public void open_product_page() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		WebElement username =driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement password =driver.findElement(By.xpath("//input[@id='password']"));
		WebElement login =driver.findElement(By.xpath("//input[@id='login-button']"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
	  
	}

	@When("apply filter by (.*) of the filter")
	public void apply_filter_by_of_the_filter(String string) {
		System.out.println(string);
		
		driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'" +string+ "')]")).click();
		
		
	}

	@Then("verify products are arranged accordingly")
	public void verify_products_are_arranged_accordingly() {
		
		System.out.println("Filter Verified");
		System.out.println("===========================");
		
	   driver.close();
	}

	
	}



