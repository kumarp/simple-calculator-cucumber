package org.example.calculator.cucumber.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "org.example.calculator.cucumber.steps", strict = true)
public class CalculatorScenarioRunnerTest {

}
