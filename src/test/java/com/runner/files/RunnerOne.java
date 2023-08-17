package com.runner.files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Mumi17\\ProjectClass\\JuneCucumber\\src\\test\\java\\FeatureFIles\\RerunScenarios.feature",
				 glue="com.stepdefinition.files",
				 plugin= {"rerun:target/failedtestcase.txt"})
public class RunnerOne {

}
