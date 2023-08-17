package com.stepdefinition.files;

import com.base.utils.BaseClass;

import io.cucumber.java.en.Given;

public class BackgroundSD extends BaseClass{

	@Given("Open the browser with Adactin URL")
	public void open_the_browser_with_adactin_url() {
	   System.out.println("Browser Opened with Adactin URL");
	}

	@Given("Deleting cookies")
	public void deleting_cookies() {
		//driver.manage().deleteAllCookies();
		System.out.println("Cookies deleted");
	}


	@Given("Sample one step")
	public void sample_one_step() {
		System.out.println("Sample One");
	}

	@Given("Sample two step")
	public void sample_two_step() {
	    System.out.println("Sample Two");
	}

	@Given("Sample three step")
	public void sample_three_step() {
	    System.out.println("Sample Three");
	}
}
