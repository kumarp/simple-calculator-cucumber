package org.example.calculator.cucumber.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "org.example.calculator.cucumber.steps", strict = true)
public class CalculatorScenarioRunnerTest {
}