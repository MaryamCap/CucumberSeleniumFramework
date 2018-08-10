package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions  {
	
	WebDriver driver;
	
	@Given("^user is already in  login page$")
	public void user_is_already_in_login_page() throws Throwable {
		
		
	    System.setProperty("webdriver.chrome.driver", "C://webdriver//chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.freecrm.com/");
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
	   
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
	    JavascriptExecutor js =  (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", loginButton);
	    
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("CRMPRO", title);
	    
	}

}
