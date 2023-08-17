package com.stepdefinition.files;

import com.base.utils.BaseClass;

import io.cucumber.java.en.Given;

public class ParallelSD extends BaseClass{

	@Given("Open the browser {string}")
	public void open_the_browser(String string) {
	   browserOpen(string);
	}

	@Given("Launch the Amazon URL")
	public void launch_the_amazon_url() {
	   loadUrl("https://www.amazon.in/");
	}

	@Given("Launch the Flipkart URL")
	public void launch_the_flipkart_url() {
	    loadUrl("https://www.flipkart.com/");
	}
}
