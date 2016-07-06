package co.sabi11.interfaces.implementation;

import co.sabi11.classes.Light;
import co.sabi11.interfaces.Command;

public class LightOffCommand implements Command {

	Light light;
	int level;
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
        level = light.getLevel();
		light.off();
	}
	
	@Override
	public void undo() {
		light.dim(level);
}

}
