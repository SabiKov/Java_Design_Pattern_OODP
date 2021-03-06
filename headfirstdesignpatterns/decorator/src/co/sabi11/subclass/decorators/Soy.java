package co.sabi11.subclass.decorators;

import co.sabi11.base.Beverage;
import co.sabi11.base.CondimentDecorator;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	// beverage's name is extended
	@Override
	public String getDescription() {
		
		return beverage.getDescription() + ", Soy";
	}

	// Compute the total of beverage's and condiment's cost
	@Override
	public double cost() {
		
		return 0.15 + beverage.cost();
	}

}
