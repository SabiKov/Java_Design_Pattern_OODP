package co.sabi11.subclasses;

import co.sabi11.base.Beverage;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso Coffee";
	}

	@Override
	public double cost() {
		
		return 1.99;
	}

}
