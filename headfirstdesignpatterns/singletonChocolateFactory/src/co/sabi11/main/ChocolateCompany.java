package co.sabi11.main;

import co.sabi11.singleton.ChocolateBoiler;

public class ChocolateCompany {

	public static void main(String[] args) {
		System.out.println("boiler - 1");
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// will return the existing instance
		System.out.println("boiler - 2");
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
		boiler2.fill();
		boiler2.boil();
		boiler2.drain();

		// will return the existing instance
		System.out.println("boiler - 3");
		ChocolateBoiler boiler3 = ChocolateBoiler.getInstance();
		boiler3.fill();
		boiler3.boil();
		boiler3.drain();
	}

}
