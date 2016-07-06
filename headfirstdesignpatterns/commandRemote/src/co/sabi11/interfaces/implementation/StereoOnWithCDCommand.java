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
public class StereoOnWithCDCommand implements Command {

	// init Stereo 
	Stereo stereo;
	
	/**
	 * Constructor 
	 */
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
		
	}

}
