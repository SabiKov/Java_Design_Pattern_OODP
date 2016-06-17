package co.sabi11.subclass;

import co.sabi11.base.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "DarkRoast"; 
	}

	@Override
	public double cost() {
		return 0.99;
	}

}
