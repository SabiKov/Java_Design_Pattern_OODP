/**
 * 
 */
package co.sabi11.base;

import java.util.ArrayList;

/**
 * @author Sabi
 *
 */
public abstract class Pizza {
	
	// Attributes
	public String name;
	public String dough;
	public String sauce;
	public ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough... ");
		System.out.println("Adding toppings: ");
		for(@SuppressWarnings("unused") String topping : toppings) {
			System.out.println(" " + toppings);
		}
	}
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in officia PizzaStore box");
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
		
	}
}
