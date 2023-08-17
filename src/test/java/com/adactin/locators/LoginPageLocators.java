package com.adactin.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;

public class LoginPageLocators extends BaseClass{
	
	public LoginPageLocators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id="login")
	private WebElement login;
	
	@FindBy(xpath="//*[text()='Logout']")
	private WebElement logOut;

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}
}
