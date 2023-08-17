package com.runner.files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Mumi17\\ProjectClass\\JuneCucumber\\src\\test\\java\\FeatureFIles", 
				 glue="com.stepdefinition.files", 
				 tags=("@SampleTags"))
				 //tags=("@smoke")) //to trigger a single tag
				 //tags=("@smoke and @regression")) //to exeucte the scenarios which had these two tags(based on AND)
				 //tags=("@smoke or @regression")) //based on OR
				 //tags=("not @sanity")) //to ignore the tag
public class TagsRunner {

}
