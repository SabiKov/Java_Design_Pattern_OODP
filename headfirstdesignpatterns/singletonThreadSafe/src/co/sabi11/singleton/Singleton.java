/**
 * 
 */
package co.sabi11.singleton;

/**
 * @author Sabi
 *
 */
public class Singleton {

	private static Singleton uniqueInstance;
	
	/**
	 * 
	 */
	private Singleton() {
	}

	/*
	 * Static method is available for every class, and the 
	 * synchronized key word foreces every thread to waits its turn before
	 * it can enter the method
	 * */
	public static synchronized Singleton getInstance() {
		
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		
		return uniqueInstance;
	}
	
	
	// other useful methods here
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
