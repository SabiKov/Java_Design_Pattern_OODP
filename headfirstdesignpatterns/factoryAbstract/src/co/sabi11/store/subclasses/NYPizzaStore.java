package co.sabi11.store.subclasses;

import co.sabi11.base.Pizza;
import co.sabi11.base.PizzaStore;
import co.sabi11.base.extend.CheesePizza;
import co.sabi11.base.extend.ClamPizza;
import co.sabi11.base.extend.PepperoniPizza;
import co.sabi11.base.extend.VeggiePizza;
import co.sabi11.factories.NYPizzaIngredientFactory;
import co.sabi11.factory.interfaces.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = 
			new NYPizzaIngredientFactory();
 
		if (type.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (type.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (type.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (type.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
		
	}

}
