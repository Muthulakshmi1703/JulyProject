package com.runner.files;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\Mumi17\\ProjectClass\\JuneCucumber\\src\\test\\java\\FeatureFIles\\ParallelExe.feature",
				 glue="com.stepdefinition.files")
public class ParallelRunner extends AbstractTestNGCucumberTests{

	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
