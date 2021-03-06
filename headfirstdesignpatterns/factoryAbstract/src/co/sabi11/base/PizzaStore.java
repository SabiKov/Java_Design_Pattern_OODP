/**
 * 
 */
package co.sabi11.base;

/**
 * @author Sabi
 *
 */
public abstract class PizzaStore {

	// Abstract Factory method
	protected abstract Pizza createPizza(String type);
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		// Create pizza by store rather than factory
		pizza = createPizza(type);
		
		System.out.println("--- Making a " + pizza.getName() + " ---");
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	
	
}
