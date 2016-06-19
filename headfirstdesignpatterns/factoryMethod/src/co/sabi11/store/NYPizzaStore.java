package co.sabi11.store;

import co.sabi11.base.Pizza;
import co.sabi11.base.PizzaStore;
import co.sabi11.pizza.subclasses.NYStyleCheesePizza;
import co.sabi11.pizza.subclasses.NYStyleClamPizza;
import co.sabi11.pizza.subclasses.NYStylePepperoniPizza;
import co.sabi11.pizza.subclasses.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
}
}
