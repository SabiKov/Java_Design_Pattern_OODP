/**
 * 
 */
package co.sabi11.singleton;

/**
 * @author Sabi
 *
 */
public class ChocolateBoiler {

	//Attributes
	private boolean empty;
	private boolean boiled; 
	
	public static ChocolateBoiler uniqueInstance;
	
	
	/**
	 * 
	 */
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public static ChocolateBoiler getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
			System.out.println("Create only once singleton instance");
		}
		System.out.println("Once singleton was created, returning the same instance");
		return uniqueInstance;
	}
	
	// fill the boiler with chocolate/milk mixture
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
		}
		System.out.println("Fill");
	}

	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
		}
		System.out.println("Drain");
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
		}
		System.out.println("Boil");
	}
	
	private boolean isBoiled() {
		return boiled;
	}

	private boolean isEmpty() {
		return empty;
	}
	
}
