package co.sabi11.subclasses.decorators;

import co.sabi11.base.Beverage;
import co.sabi11.base.CondimentDecorator;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
	
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		
		return beverage.cost() + 0.20;
	}

}
