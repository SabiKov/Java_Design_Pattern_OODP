/**
 * 
 */
package co.sabi11.interfaces.implementation;

import co.sabi11.classes.Stereo;
import co.sabi11.interfaces.Command;

/**
 * @author Sabi
 *
 */
public class StereoOffCommand implements Command {
	// Init Stereo
	Stereo stereo;
 
	// Constructor
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}
}
