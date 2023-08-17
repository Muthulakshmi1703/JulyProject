package com.stepdefinition.files;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass {

	@Before
	public void beforeScenario() {
		System.out.println("It will run before the every scenario");
	}
	
	@After
	public void afterScenario() {
		System.out.println("It will run after the every scenario");
	}
}
