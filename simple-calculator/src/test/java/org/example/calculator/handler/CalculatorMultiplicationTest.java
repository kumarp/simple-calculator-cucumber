package org.example.calculator.handler;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorMultiplicationTest {

	private CalculatorHandler calculatorHandler = new CalculatorHandler();

	@Test
	public void shouldMultiplyTwoPositiveNumbers() {
		assertTrue(calculatorHandler.doMultiplication(3, 5) == 15);
	}

	@Test
	public void shouldMultiplyOnePositiveNumberAndZero() {
		assertTrue(calculatorHandler.doMultiplication(3, 0) == 0);
	}

	@Test
	public void shouldMultiplyZeroAndZero() {
		assertTrue(calculatorHandler.doMultiplication(0, 0) == 0);
	}

}
