package model;

/*
 * This is an online tutorial
 * ref: https://www.youtube.com/watch?v=dTVVa2gfht8
 * */
public class CalculatorModel {

	private int calculationValue;
	
	public void addTwoNumbers(int firstNumber, int secondNumber) {
		
		calculationValue = firstNumber + secondNumber;
	}
	
	public int getCalculationValue() {
		
		return calculationValue;
	}
	
}