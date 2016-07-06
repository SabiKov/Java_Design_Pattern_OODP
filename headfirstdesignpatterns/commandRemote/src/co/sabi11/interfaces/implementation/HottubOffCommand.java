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
public class HottubOffCommand implements Command {

	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.cool();
		hottub.off();
	}

}
