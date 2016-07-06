/**
 * 
 */
package co.sabi11.interfaces.implementation;

import co.sabi11.classes.Hottub;
import co.sabi11.interfaces.Command;

/**
 * @author Sabi
 *
 */
public class hottubOnCommand implements Command {
	
	Hottub hottub;

	/**
	 * Constructor
	 */
	public hottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.cool();
		hottub.off();
		
	}

}
