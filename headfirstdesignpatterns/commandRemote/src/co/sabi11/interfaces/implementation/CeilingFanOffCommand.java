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
public class CeilingFanOffCommand implements Command {
	
	// Initialise CeilingFan
	CeilingFan ceilingFan;
	/**
	 * Constructor
	 */
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		
		this.ceilingFan = ceilingFan;
	}
	@Override
	public void execute() {
		
		ceilingFan.off();
		
	}


}
