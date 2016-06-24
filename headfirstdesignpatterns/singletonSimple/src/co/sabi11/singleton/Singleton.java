/**
 * 
 */
package co.sabi11.singleton;

/**
 * @author Sabi
 * This class demonstrates
 *  a simple singleton pattern implementation
 */
public class Singleton {
	
	// Static variable to 
	// hold one instance of the ssingleton class
	private static Singleton uniqueInstance;
	
	/**
	 * Private constructor allows this class to instantiate 
	 * this singleton 
	 */
	public Singleton() {}
	
	// getInstance if singleton exits the method returns
	// the same unique singleton.
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	// other useful methods here
	public String getDescription() {
		return "I'm a classic Singleton!";
	}

}
