package com.testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "Cucumber/Cucumber.feature",
		glue= "com.stepdef")

public class TestNGRunner extends AbstractTestNGCucumberTests{

}
