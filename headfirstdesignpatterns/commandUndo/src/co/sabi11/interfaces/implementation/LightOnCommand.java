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
	int level;
	public LightOnCommand(Light light) {
		this.light = light;
	}
 
	@Override
	public void execute() {
        level = light.getLevel();
		light.on();
	}
 
	@Override
	public void undo() {
		light.dim(level);
 }

}
