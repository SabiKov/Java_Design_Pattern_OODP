/**
 * 
 */
package co.sabi11.factories;

import co.sabi11.factory.interfaces.PizzaIngredientFactory;
import co.sabi11.items.interfaces.Cheese;
import co.sabi11.items.interfaces.Clams;
import co.sabi11.items.interfaces.Dough;
import co.sabi11.items.interfaces.Pepperoni;
import co.sabi11.items.interfaces.Sauce;
import co.sabi11.items.interfaces.Veggies;
import co.sabi11.items.interfaces.implementations.FreshClams;
import co.sabi11.items.interfaces.implementations.Garlic;
import co.sabi11.items.interfaces.implementations.MarinaraSauce;
import co.sabi11.items.interfaces.implementations.Mushroom;
import co.sabi11.items.interfaces.implementations.Onion;
import co.sabi11.items.interfaces.implementations.RedPepper;
import co.sabi11.items.interfaces.implementations.ReggianoCheese;
import co.sabi11.items.interfaces.implementations.SlicedPepperoni;
import co.sabi11.items.interfaces.implementations.ThinCrustDough;

/**
 * @author Sabi
 *
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		
		return new FreshClams();
	}

}
