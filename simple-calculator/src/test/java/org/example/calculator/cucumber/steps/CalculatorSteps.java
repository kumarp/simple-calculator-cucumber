package org.example.calculator.cucumber.steps;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.example.calculator.handler.CalculatorHandler;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {

	int operand1;
	int operand2;
	int result;

	CalculatorHandler calculatorHandler = new CalculatorHandler();

	@Given("^the following calculator input:$")
	public void the_following_calculator_input(DataTable calculatorInputDataTable) throws Throwable {
		List<Map<String, String>> rows = calculatorInputDataTable.asMaps();
		for (Map<String, String> row : rows) {
			operand1 = Integer.parseInt(row.get("Operand 1"));
			operand2 = Integer.parseInt(row.get("Operand 2"));
		}
	}

	@When("^I do an? addition calculation$")
	public void I_do_a_addition_calculation() throws Throwable {
		result = calculatorHandler.doAddition(operand1, operand2);
	}

	@Then("^I expect the result \"([^\"]*)\"$")
	public void I_expect_the_result(String expectedResult) throws Throwable {
		assertTrue(result == Float.parseFloat(expectedResult));
	}

	/*
	 * @Then("^I expect the result (\\d+)$") public void I_expect_the_result(int
	 * expectedResult) throws Throwable { assertTrue(expectedResult == result); }
	 */

	@Then("I expect the result {double}")
	public void i_expect_the_result(Double expectedResult) {
		// Write code here that turns the phrase above into concrete actions
		assertTrue(expectedResult == result);
	}
}
