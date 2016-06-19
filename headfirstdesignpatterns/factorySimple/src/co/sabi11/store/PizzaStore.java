/**
 * 
 */
package co.sabi11.store;

import co.sabi11.base.Pizza;
import co.sabi11.factory.SimplePizzaFactory;

/**
 * @author Sabi
 *
 */
public class PizzaStore {

	// Creating reference of the factory
	SimplePizzaFactory factory;

	// Factory is passed as a reference 
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		// signing pizza by returned pizza type from factory
		pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
