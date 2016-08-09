package org.example.calculator.handler;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorDivisionTest {

	private CalculatorHandler calculatorHandler = new CalculatorHandler();

	@Test
	public void shouldDivideTwoPositiveNumbers() {
		assertTrue(calculatorHandler.doDivision(15, 5) == 3);
	}

	@Test
	public void shouldAddOnePositiveNumberAndZero() {
		assertTrue(calculatorHandler.doDivision(0, 6) == 0);
	}

	@Test
	public void shouldAddZeroAndZero() {
		assertTrue(calculatorHandler.doDivision(10, -2) == -5);
	}

}
