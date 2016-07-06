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
public class GarageDoorDownCommand implements Command {
	
	// Init 
	GarageDoor garageDoor;

	/**
	 * 
	 */
	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		
		garageDoor.down();
	}

}
