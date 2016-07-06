/**
 * 
 */
package co.sabi11.classes;

/**
 * @author Sabi
 *
 */
public class Light {
	
	//Attributes
	String location = "";
	/**
	 * Constructor
	 */
	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " light is on");
	}
	
	public void off() {
		System.out.println(location + "light is off");
	}
}
