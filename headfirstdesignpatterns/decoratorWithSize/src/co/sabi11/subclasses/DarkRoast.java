package co.sabi11.subclasses;

import co.sabi11.base.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast Coffe";
	}

	@Override
	public double cost() {
		
		return 0.99;
	}

}
