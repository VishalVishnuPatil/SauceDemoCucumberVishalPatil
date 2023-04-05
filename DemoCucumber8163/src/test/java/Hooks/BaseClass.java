package Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;

public class BaseClass {

	protected static WebDriver driver;
	
	@Before(order = 0)
	public void setup()
	{
		System.out.println("hi");
	}
	
	@Before(order = 1)
	public void setup2()
	{
		System.out.println("hi");
	}
	
	@Before(order = 2)
	public void setup3()
	{
		System.out.println("hi");
	}
	
	@After
	public void tear()
	{
		System.out.println("hi");
	}
	
}
