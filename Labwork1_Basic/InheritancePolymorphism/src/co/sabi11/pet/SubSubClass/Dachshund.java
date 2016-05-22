package co.sabi11.pet.SubSubClass;

import co.sabi11.pet.SubClass.Dog;

public class Dachshund extends Dog {
	
	private int size;
	private String petFood = "I love to eat meat";

	public Dachshund(String petType, String petName, int petAge, String tricks, String food, int size) {
		super(petType, petName, petAge, tricks, food);
		
		this.size = size;
	}

	public void display() {

		System.out.println("Dachshund Class: Pet type: " + petType + " Name: " + petName + " Age: " + petAge + " Trick: " + tricks + " Size: " + size + " Size: " + size);
	}
	
	//Polymorphism and dynamic binding
	public void feedPet() {
		System.out.println(this.getClassName() + " : " + petFood);
	}
}
