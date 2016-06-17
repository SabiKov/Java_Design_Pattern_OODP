package co.sabi11.base;

import co.sabi11.enumClass.Size;

public abstract class CondimentDecorator extends Beverage {

	public Beverage beverage;
	public abstract String getDescription();
	
	public Size getSize() {
		return beverage.getSize();
	}
	
}
