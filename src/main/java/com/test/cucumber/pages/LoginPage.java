package com.test.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.test.cucumber.util.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(id = "email")
	WebElement username;
	
	@FindBy(id = "pass")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
		
	}
	
	
	
	public void enterUserName(String username) {
		this.username.sendKeys(prop.getProperty("username"));

	}

	public void enterPassword(String password) {
		this.password.sendKeys(prop.getProperty("password"));

	}

	public void clickLoginButton() {
		loginButton.click();

	}

}
