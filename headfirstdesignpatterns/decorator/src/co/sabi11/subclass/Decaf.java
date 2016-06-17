package co.sabi11.subclass;

import co.sabi11.base.Beverage;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double cost() {
		
		return 1.05;
	}

}
