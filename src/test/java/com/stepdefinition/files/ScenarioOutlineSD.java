package com.stepdefinition.files;

import org.openqa.selenium.WebElement;

import com.adactin.locators.LoginPageLocators;
import com.base.utils.BaseClass;

import io.cucumber.java.en.When;

public class ScenarioOutlineSD extends BaseClass{

	@When("Enter username as {string}")
	public void enter_username_as(String string) {
		WebElement user = new LoginPageLocators().getUser();
		dataSend(user, string);
	}
	@When("Enter password as {string}")
	public void enter_password_as(String string) {
		   dataSend(new LoginPageLocators().getPwd(), string);
	}



}
