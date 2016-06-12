package co.sabi11.interfaces;


/*
 * Flying behaviour implementation for ducks that do fly 
 */

public class FlyWithWings implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}
}
