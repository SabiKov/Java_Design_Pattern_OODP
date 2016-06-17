package co.sabi11.subclasses;

import co.sabi11.base.Beverage;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf Coffee";
	}

	@Override
	public double cost() {
		
		return 1.05;
	}

}
