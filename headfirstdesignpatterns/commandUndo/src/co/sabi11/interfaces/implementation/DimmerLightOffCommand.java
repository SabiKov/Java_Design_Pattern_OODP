package co.sabi11.interfaces.implementation;

import co.sabi11.classes.Light;
import co.sabi11.interfaces.Command;

public class DimmerLightOffCommand implements Command {

	Light light;
	int prevLevel;

	public DimmerLightOffCommand(Light light) {
		this.light = light;
		prevLevel = 100;
	}

	public void execute() {
		prevLevel = light.getLevel();
		light.off();
	}

	public void undo() {
		light.dim(prevLevel);
	}

}
