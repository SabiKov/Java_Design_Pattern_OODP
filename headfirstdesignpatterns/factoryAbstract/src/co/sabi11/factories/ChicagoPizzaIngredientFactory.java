package co.sabi11.factories;

import co.sabi11.factory.interfaces.PizzaIngredientFactory;
import co.sabi11.items.interfaces.Cheese;
import co.sabi11.items.interfaces.Clams;
import co.sabi11.items.interfaces.Dough;
import co.sabi11.items.interfaces.Pepperoni;
import co.sabi11.items.interfaces.Sauce;
import co.sabi11.items.interfaces.Veggies;
import co.sabi11.items.interfaces.implementations.BlackOlives;
import co.sabi11.items.interfaces.implementations.Eggplant;
import co.sabi11.items.interfaces.implementations.FrozenClams;
import co.sabi11.items.interfaces.implementations.MozzarellaCheese;
import co.sabi11.items.interfaces.implementations.PlumTomatoSauce;
import co.sabi11.items.interfaces.implementations.SlicedPepperoni;
import co.sabi11.items.interfaces.implementations.Spinach;
import co.sabi11.items.interfaces.implementations.ThickCrustDough;

/*
 * Implementation of PizzaIngredientFactory interface in a way of Chicago factory
 * */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
                new Spinach(), 
                new Eggplant() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}

}