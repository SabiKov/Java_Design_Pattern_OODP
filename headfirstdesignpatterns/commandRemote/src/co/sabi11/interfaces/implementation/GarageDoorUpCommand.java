/**
 * 
 */
package co.sabi11.interfaces.implementation;

import co.sabi11.classes.GarageDoor;
import co.sabi11.interfaces.Command;

/**
 * @author Sabi
 *
 */
public class GarageDoorUpCommand implements Command {
	
	// Init garageDoor
	GarageDoor garageDoor;
	
	/**
	 * 
	 */
	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		
		garageDoor.up();
		
	}

}
