package co.sabi11.subclasses.decorators;

import co.sabi11.base.Beverage;
import co.sabi11.base.CondimentDecorator;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		
		return beverage.cost() + 0.10;
	}

}
