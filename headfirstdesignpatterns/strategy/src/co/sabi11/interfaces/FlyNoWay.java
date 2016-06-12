package co.sabi11.interfaces;

/*
 * Flying behaviour implementation for ducks that do not fly 
 * */

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}
	
}
