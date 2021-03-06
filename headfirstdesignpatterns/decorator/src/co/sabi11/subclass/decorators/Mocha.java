/**
 * 
 */
package co.sabi11.subclass.decorators;

import co.sabi11.base.Beverage;
import co.sabi11.base.CondimentDecorator;

/**
 * @author Sabi
 * Mocha is a decorator subclass of "CondimentDecorator"
 *
 */
public class Mocha extends CondimentDecorator {

	// The beverage item will be decorated
	Beverage beverage;
	
	/**
	 * Constructor takes a beverage in order to wrapping with Mocha decorator 
	 */
	public Mocha(Beverage beverage) {
		
		this.beverage = beverage;
	}

	// Adding condiment's name to the base beverage
	@Override
	public String getDescription() {
	
		return beverage.getDescription() + ", Mocha";
	}

	// Compute the total of the beverage plus condiment's costs
	@Override
	public double cost() {
		
		return 0.20 + beverage.cost();
	}

}
