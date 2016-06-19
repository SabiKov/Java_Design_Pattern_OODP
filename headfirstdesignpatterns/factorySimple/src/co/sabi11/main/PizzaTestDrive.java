package co.sabi11.main;

import co.sabi11.base.Pizza;
import co.sabi11.factory.SimplePizzaFactory;
import co.sabi11.store.PizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// reference of factory
		SimplePizzaFactory factory = new SimplePizzaFactory();
		
		// reference of pizzaStore
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
 
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);

	}

}
