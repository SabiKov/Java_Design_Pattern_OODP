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
public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
}

}
