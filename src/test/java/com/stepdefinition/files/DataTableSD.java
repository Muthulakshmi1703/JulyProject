package com.stepdefinition.files;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableSD {

	@Given("Open browser")
	public void open_browser() {
	   System.out.println("Browser opened");
	}

	@Given("Launch facebook URL")
	public void launch_facebook_url() {
	  System.out.println("Facebook URL launched successfully");
	}

	@When("User enters the username as List")
	public void user_enters_the_username_as_list(io.cucumber.datatable.DataTable dataTable) {
		List<String> user = dataTable.asList();
		System.out.println(user.get(1));
	}

	@When("User enters the password as List")
	public void user_enters_the_password_as_list(io.cucumber.datatable.DataTable dataTable) {
	   List<String> pwd = dataTable.asList();
	   System.out.println(pwd.get(1));
	}

	@When("Click the Login btn")
	public void click_the_login_btn() {
	   System.out.println("Login button Clicked");
	}
	
	@When("User enters the username and password as Lists")
	public void user_enters_the_username_and_password_as_lists(io.cucumber.datatable.DataTable dataTable) {
	   List<List<String>> data = dataTable.asLists();
	   System.out.println(data.get(2).get(0)); //-> Hema
	   System.out.println(data.get(1).get(1)); //-> rinto123
	}
	
	@When("User enters the username and password as Map")
	public void user_enters_the_username_and_password_as_map(io.cucumber.datatable.DataTable dataTable) {
	   Map<String, String> data = dataTable.asMap();
	   System.out.println(data.get("Username"));
	   System.out.println(data.get("Password"));
	}
	
	@When("User enters the username password and mail as Maps")
	public void user_enters_the_username_password_and_mail_as_maps(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String, String>> data = dataTable.asMaps();
	   System.out.println(data.get(0).get("Username"));
	   System.out.println(data.get(1).get("Password"));
	   System.out.println(data.get(2).get("Email"));
	}

}
