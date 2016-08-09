package org.example.calculator.handler;

public class CalculatorHandler {

	public int doAddition(int operand1, int operand2) {
		int result = operand1 + operand2;
		return result;
	}

	public int doSubtraction(int operand1, int operand2) {
		int result = operand1 - operand2;
		return result;
	}

	public int doMultiplication(int operand1, int operand2) {
		int result = operand1 * operand2;
		return result;
	}

	public int doDivision(int operand1, int operand2) {
		int result = operand1 / operand2;
		return result;
	}

}
