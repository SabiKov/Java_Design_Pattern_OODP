package co.sabi11.subclass;

import co.sabi11.base.Beverage;

public class HouseBlend extends Beverage  {

	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
