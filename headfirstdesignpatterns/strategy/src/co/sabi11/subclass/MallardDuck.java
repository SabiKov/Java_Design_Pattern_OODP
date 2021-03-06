package co.sabi11.subclass;

import co.sabi11.base.AbstractDuck;
import co.sabi11.interfaces.FlyWithWings;
import co.sabi11.interfaces.Quack;

public class MallardDuck extends AbstractDuck  {

	public MallardDuck() {
		
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}

	@Override
	public void display() {	
		System.out.println("I'm a real Mallard duck");
	}

}
