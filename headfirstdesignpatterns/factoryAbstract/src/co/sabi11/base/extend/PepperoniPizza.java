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
public class PepperoniPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
	
	/**
	 * 
	 */
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	protected void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
		pepperoni = ingredientFactory.createPepperoni();
		
	}

}
