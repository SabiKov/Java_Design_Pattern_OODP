package co.sabi11.factory.interfaces;

import co.sabi11.items.interfaces.Cheese;
import co.sabi11.items.interfaces.Clams;
import co.sabi11.items.interfaces.Dough;
import co.sabi11.items.interfaces.Pepperoni;
import co.sabi11.items.interfaces.Sauce;
import co.sabi11.items.interfaces.Veggies;

public interface PizzaIngredientFactory {
	
	/*
	 * All ingredients are implemented as an interface.
	 * Each ingredient has its own class implementation
	 * */
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
	
}
