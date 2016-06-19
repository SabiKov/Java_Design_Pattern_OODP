/**
 * 
 */
package co.sabi11.pizzas;

import co.sabi11.base.Pizza;

/**
 * @author Sabi
 *
 */
public class PepperoniPizza extends Pizza {

	/**
	 * 
	 */
	public PepperoniPizza() {
		name = "Pepperoni Pizza";
		dough = "Crust";
		sauce = "Marinara sauce";
		toppings.add("Sliced Pepperoni");
		toppings.add("Sliced Onion");
		toppings.add("Grated parmesan cheese");
	}

}
