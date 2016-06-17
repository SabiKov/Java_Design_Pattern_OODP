package co.sabi11.subclasses;

import co.sabi11.base.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blen Coffee"; 
	}

	@Override
	public double cost() {
		
		return 0.89;
	}

}
