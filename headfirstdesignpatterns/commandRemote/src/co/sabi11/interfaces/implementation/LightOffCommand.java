/**
 * 
 */
package co.sabi11.interfaces.implementation;

import co.sabi11.classes.Light;
import co.sabi11.interfaces.Command;

/**
 * @author Sabi
 *
 */
public class LightOffCommand implements Command {
	
	// Instantiate Light
	Light light;

	/**
	 * 
	 */
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
		
	}

}
