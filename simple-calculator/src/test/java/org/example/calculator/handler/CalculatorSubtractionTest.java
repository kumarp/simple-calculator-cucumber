package org.example.calculator.handler;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorSubtractionTest {

	private CalculatorHandler calculatorHandler = new CalculatorHandler();

	@Test
	public void shouldSubtractTwoPositiveNumbers() {
		assertTrue(calculatorHandler.doSubtraction(3, 5) == -2);
	}

	@Test
	public void shouldSubtractOnePositiveNumberAndZero() {
		assertTrue(calculatorHandler.doSubtraction(3, 0) == 3);
	}

	@Test
	public void shouldSubtractZeroAndZero() {
		assertTrue(calculatorHandler.doSubtraction(0, 0) == 0);
	}

}
