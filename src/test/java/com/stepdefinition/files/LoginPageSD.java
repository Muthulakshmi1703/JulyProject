package com.stepdefinition.files;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.adactin.locators.LoginPageLocators;
import com.base.utils.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSD extends BaseClass{

	@Given("Open the Browser")
	public void open_the_browser() {
	  browserOpen("chrome");
	}

	@Given("Launch the Adactin URL")
	public void launch_the_adactin_url() {
	   loadUrl("https://adactinhotelapp.com/");
	}

	@When("Enter username")
	public void enter_username() {
		WebElement user = new LoginPageLocators().getUser();
		dataSend(user, "Muthulakshmi07");
	}

	@When("Enter password")
	public void enter_password() {
	   dataSend(new LoginPageLocators().getPwd(), "Test@123");
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	    click(new LoginPageLocators().getLogin());
	}

	@Then("Validate User logged in or not")
	public void validate_user_logged_in_or_not() {
	  try {
		  WebElement logout = new LoginPageLocators().getLogOut();
		  if(logout.isDisplayed()) {
			  System.out.println("Test Passed, User logged in successfully");
		  }
	  }catch(NoSuchElementException e) {
		  System.out.println("Test Failed, User not logged in");
	  }
	}

	@Then("Validate Adactin URL launched successfully")
	public void validate_adactin_url_launched_successfully() {
	   String actualUrl = getCurrentUrl();
	   String expectedUrl = "https://adactinhotelapp.com/";
	   if(expectedUrl.equals(actualUrl)) {
		   System.out.println("Test Passed");
	   }else {
		   System.out.println("Test Failed");
	   }
	}



}
