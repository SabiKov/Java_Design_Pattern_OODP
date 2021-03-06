/**
 * 
 */
package co.sabi11.base;

import co.sabi11.enumClass.Size;

/**
 * @author Sabi
 *
 */
public abstract class Beverage {
	
	Size size = Size.TALL;
	protected String description = "Unknwon Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public Size getSize() {
		return this.size;
	}

	public abstract double cost();
	
}
