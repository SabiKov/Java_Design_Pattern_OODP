package co.sabi11.subclass.decorators;

import co.sabi11.base.Beverage;
import co.sabi11.base.CondimentDecorator;

public class Whip extends CondimentDecorator {
	
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		
		return 0.10 + beverage.cost();
	}

}
