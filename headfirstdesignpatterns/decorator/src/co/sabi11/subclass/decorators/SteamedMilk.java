package co.sabi11.subclass.decorators;

import co.sabi11.base.Beverage;
import co.sabi11.base.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator {

	Beverage beverage;
	
	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription() + ", Steamed Milk";
	}

	@Override
	public double cost() {
		
		return 0.10 + beverage.cost();
	}

}
