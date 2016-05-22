/**
 * 
 */
package co.sabi11.pet.SubClass;

import co.sabi11.pet.Super.Pet;

/**
 * @author Sabi
 *
 */
public class Cat extends Pet {
	
	private String petFood = "I love to eat mice";
	
	
	public Cat(String petType, String petName, int petAge, String food) {
		super(petType, petName, petAge, food);
	}
	
	// Display some dummy content
	public void display() {	
		System.out.println("Cat type:" + petType + " Name: " + petName + " Age: " + petAge);
	}
	
	//Polymorphism and dynamic binding
	public void feedPet() {
		System.out.println(this.getClassName() + " : " + petFood);
	}

}
