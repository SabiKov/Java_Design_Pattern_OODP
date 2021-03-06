/**
 * 
 */
package co.sabi11.base;

/**
 * @author Sabi
 *
 */
public abstract class Beverage {

	// default value of description, it'll be overwritten 
	protected String description = "Uknown Beverage";
	
	// return a description of item
	public String getDescription() {
		return description;
	}

	// Cost method needs to be implemented in every subclass
	public abstract double cost();
}
