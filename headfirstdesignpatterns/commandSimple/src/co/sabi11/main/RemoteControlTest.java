/**
 * 
 */
package co.sabi11.main;

import co.sabi11.classes.GarageDoor;
import co.sabi11.classes.Light;
import co.sabi11.interfaces.implementation.GarageDoorOpenCommand;
import co.sabi11.interfaces.implementation.LightOffCommand;
import co.sabi11.interfaces.implementation.LightOnCommand;
import co.sabi11.remoteControlClass.SimpleRemoteControl;

/**
 * @author Sabi
 *
 */
public class RemoteControlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * The remote object is an Invoker, 
		 * it will handle command object that can be used to make request
		 */
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		// Light objct acts as a recevier of the request
		Light light = new Light();
		
		// Create a command and pass it to the recevier
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);

		// Pass the command (lightOn) to the invoker
		remote.setCommand(lightOn);
		//remote.setCommand(lightOff);
		remote.buttonwasPressed();
		
		remote.setCommand(lightOff);
		remote.buttonwasPressed();
		
		System.out.println("------------------------------------------------------");
		// garageDoor test
		SimpleRemoteControl remote1 = new SimpleRemoteControl();
		Light light1 = new Light();
		GarageDoor garageDoor = new GarageDoor();
		LightOnCommand garageLightOn = new LightOnCommand(light1);
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		
		remote1.setCommand(garageLightOn);
		remote1.buttonwasPressed();
		remote1.setCommand(garageDoorOpenCommand);
		remote1.buttonwasPressed();
	}

}
