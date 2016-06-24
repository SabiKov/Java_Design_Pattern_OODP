/**
 * 
 */
package co.sabi11.singleton;

/**
 * @author Sabi
 * Implementation of static initilisation of singleton
 */
public class Singleton {
	
	/*
	 * Signing static singleton variable is thread safe,
	 * this approach generates a singleton when the class is loaded by JVM.
	 * JVM garantees that the instance will be created before any thread
	 * accesses the static uniqueInstance variable.
	 * */
	private static Singleton uniqueInstance = new Singleton();

	/**
	 * 
	 */
	private Singleton() {
		
	}

	public static Singleton getInstance() {
		return uniqueInstance;
		
	}
	
	// 
	public String getDescription() {
		return "I'm a static initialiser Singleton!";
	}
}
