/**
 * 
 */
package co.sabi11.subclass;

import co.sabi11.base.AbstractDuck;
import co.sabi11.interfaces.FlyNoWay;
import co.sabi11.interfaces.Quack;

/**
 * @author Sabi
 *
 */
public class ModelDuck extends AbstractDuck {

	public ModelDuck() {
		
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a model duck");
		
	}

}
