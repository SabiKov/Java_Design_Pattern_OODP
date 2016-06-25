/**
 * 
 */
package co.sabi11.interfaces.implementation;

import co.sabi11.classes.GarageDoor;
import co.sabi11.intefaces.Command;

/**
 * @author Sabi
 *
 */
public class GarageDoorOpenCommand implements Command {

	GarageDoor garageDoor;
	/**
	 * 
	 */
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.open();
		
	}

}
