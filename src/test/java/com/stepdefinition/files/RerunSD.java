package com.stepdefinition.files;

import org.junit.Assert;

import io.cucumber.java.en.Given;

public class RerunSD {

	@Given("Sample step one")
	public void sample_step_one() {
	   System.out.println("Sample One");
	   Assert.assertTrue(true);
	}

	@Given("Sample step two")
	public void sample_step_two() {
		System.out.println("Sample Two");
	}

	@Given("Sample step three")
	public void sample_step_three() {
		System.out.println("Sample Three");
		Assert.assertTrue(false);
	}

}
