package aero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login  {
	
	WebDriver driver;

	
	@Given("landing page is open")
	public void landing_page_is_open()
	{
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   driver.get("https://www.saucedemo.com/");
	   
	}

	@When("entered username")
	public void entered_username() 
	{
		
		WebElement username =driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("abc");
	}

	@When("entered password")
	public void entered_password() 
	{
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("abc");
	    
	}

	@When("click on button")
	public void click_on_button() 
	{
		WebElement login =driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
	
	   
	}

	@Then("home page should appear")
	public void home_page_should_appear() {
		System.out.println(" my home page is not opening");
	    
	}


}
