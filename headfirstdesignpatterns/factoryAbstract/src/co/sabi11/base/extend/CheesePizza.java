/**
 * 
 */
package co.sabi11.base.extend;

import co.sabi11.base.Pizza;
import co.sabi11.factory.interfaces.PizzaIngredientFactory;

/**
 * @author Sabi
 *
 */
public class CheesePizza extends Pizza {

	// Instantiate factory
	PizzaIngredientFactory ingredientFactory;
	
	
	/**
	 * PizzaIngredientFactory is passed into constructor
	 */
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		
		this.ingredientFactory = ingredientFactory;
	}


	@Override
	protected void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		
	}

}
