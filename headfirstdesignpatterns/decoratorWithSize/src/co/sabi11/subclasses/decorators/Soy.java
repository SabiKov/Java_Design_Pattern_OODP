package co.sabi11.subclasses.decorators;

import co.sabi11.base.Beverage;
import co.sabi11.base.CondimentDecorator;
import co.sabi11.enumClass.Size;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		
		double cost = beverage.cost();
		
		if (beverage.getSize() == Size.TALL) {
			cost += .10;
		} 
		else if (beverage.getSize() == Size.GRANDE) {
			cost += .15;
		} 
		else if (beverage.getSize() == Size.VENTI) {
			cost += .20;
		}
		return cost;
	}

}
