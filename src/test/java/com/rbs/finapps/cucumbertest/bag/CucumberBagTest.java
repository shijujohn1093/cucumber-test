package com.rbs.finapps.cucumbertest.bag;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/bag", plugin = { "pretty", "html:target/cucumber" })
public class CucumberBagTest {
	
}