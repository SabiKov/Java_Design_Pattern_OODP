/**
 * 
 */
package co.sabi11.interfaces.implementation;

import co.sabi11.classes.Light;
import co.sabi11.intefaces.Command;

/**
 * @author Sabi
 * Since the LIGHT has two states, on and off. 
 * This class is implementation of ON state.
 */
public class LightOnCommand implements Command {

	Light light;
	/**
	 * 
	 */
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
		
	}

}
