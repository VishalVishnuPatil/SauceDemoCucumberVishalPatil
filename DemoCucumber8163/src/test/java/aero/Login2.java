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

public class Login2 
{

	WebDriver driver;
	
	@Given("open the landing page")
	public void open_the_landing_page() {
	    
		WebDriverManager.chromedriver().setup();
		   driver= new ChromeDriver();
		   driver.get("https://www.saucedemo.com/");
	}

	@When("username as {string} in usernamefield")
	public void username_as_in_usernamefield(String user) {
	    
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys(user);
	}

	@When("password as {string} in passwordfield")
	public void password_as_in_passwordfield(String pass) {
		
		WebElement password =driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(pass);
		
	}
	    
	

	@When("click button")
	public void click_button(){
		
		WebElement login =driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
	    
	}

	@Then("homepage should appear")
	public void homepage_should_appear() {
		
		System.out.println("My Home is opening ");
		driver.close();
	    
	}
	
	@Then("User Should Stay on login Page")
	public void user_Should_Stay_on_login_Page() 
	{
	    System.out.println("It is still on Home Page");
	    driver.close();
	}

}
