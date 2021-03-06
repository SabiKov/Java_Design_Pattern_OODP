package co.sabi11.main;

import co.sabi11.base.Beverage;
import co.sabi11.subclass.DarkRoast;
import co.sabi11.subclass.Espresso;
import co.sabi11.subclass.HouseBlend;
import co.sabi11.subclass.decorators.Mocha;
import co.sabi11.subclass.decorators.Soy;
import co.sabi11.subclass.decorators.Whip;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		
		// Make a basic espresso without any condiment 
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		// Make a DarkRoast with few condiments
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);	
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		// Make a HouseBend with few condiments
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);	
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}

}
