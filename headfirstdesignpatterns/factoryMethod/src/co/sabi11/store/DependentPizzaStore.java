package co.sabi11.store;

import co.sabi11.base.Pizza;
import co.sabi11.pizza.subclasses.ChicagoStyleCheesePizza;
import co.sabi11.pizza.subclasses.ChicagoStyleClamPizza;
import co.sabi11.pizza.subclasses.ChicagoStylePepperoniPizza;
import co.sabi11.pizza.subclasses.ChicagoStyleVeggiePizza;
import co.sabi11.pizza.subclasses.NYStyleCheesePizza;
import co.sabi11.pizza.subclasses.NYStyleClamPizza;
import co.sabi11.pizza.subclasses.NYStylePepperoniPizza;
import co.sabi11.pizza.subclasses.NYStyleVeggiePizza;

public class DependentPizzaStore {

	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("NY")) {
			if (type.equals("cheese")) {
				pizza = new NYStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new NYStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new NYStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new NYStylePepperoniPizza();
			}
		} else if (style.equals("Chicago")) {
			if (type.equals("cheese")) {
				pizza = new ChicagoStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new ChicagoStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new ChicagoStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new ChicagoStylePepperoniPizza();
			}
		} else {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
}
}