package com.runner.files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Mumi17\\ProjectClass\\JuneCucumber\\src\\test\\java\\FeatureFIles\\LoginPage.feature",
				 glue="com.stepdefinition.files")
				 //plugin= {"html:reports/login.html", "json:reports/login.json"})
				 //monochrome=true) //remove human un-readable data from console
				 //strict = true)//execute the code, and return the missed snippets
				 //dryRun=true)//it doesn't execute the code, just return missed snippets

public class RunnerClass {

}
