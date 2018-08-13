package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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

//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password() throws Throwable {
//		driver.findElement(By.name("username")).sendKeys("naveenk");
//		driver.findElement(By.name("password")).sendKeys("test@123");
//	   
//	}
	
	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
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
	
	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() throws Throwable {
		driver.switchTo().frame("mainpanel");
	    Actions act = new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("//a[contains(text() ,'Contacts')]"))).build().perform();
	    driver.findElement(By.xpath("//a[contains(text() ,'New Contact')]")).click();
	}

	@Then("^user enter contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_contact_details_and_and(String firstName, String lastName, String position) throws Throwable {
		
	   driver.findElement(By.id("first_name")).sendKeys(firstName);
	   driver.findElement(By.id("surname")).sendKeys(lastName);
	   driver.findElement(By.id("company_position")).sendKeys(position);
	 //  driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/input[2]")).click();
	   driver.findElement(By.xpath("//form[@id='contactForm']/table/tbody/tr/td/input[2]")).click();
	 
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.quit();
	}

}
