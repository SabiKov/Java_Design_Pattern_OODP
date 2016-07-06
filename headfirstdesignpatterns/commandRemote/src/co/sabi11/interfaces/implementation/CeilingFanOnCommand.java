/**
 * 
 */
package co.sabi11.interfaces.implementation;

import co.sabi11.classes.CeilingFan;
import co.sabi11.interfaces.Command;

/**
 * @author Sabi
 *
 */
public class CeilingFanOnCommand implements Command {
	
	// Initialise CeilingFan class
	CeilingFan ceilingFan;
	
	
	/**
	 * Constructor 
	 */
	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		
		this.ceilingFan = ceilingFan;
	}


	@Override
	public void execute() {
		
		ceilingFan.high();
		
	}

}
