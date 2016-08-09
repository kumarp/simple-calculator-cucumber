package org.example.calculator.handler;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorAdditionTest {

	private CalculatorHandler calculatorHandler = new CalculatorHandler();

	@Test
	public void shouldAddTwoPositiveNumbers() {
		assertTrue(calculatorHandler.doAddition(3, 5) == 8);
	}

	@Test
	public void shouldAddOnePositiveNumberAndZero() {
		assertTrue(calculatorHandler.doAddition(3, 0) == 3);
	}

	@Test
	public void shouldAddZeroAndZero() {
		assertTrue(calculatorHandler.doAddition(0, 0) == 0);
	}

}
