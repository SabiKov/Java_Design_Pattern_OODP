/**
 * 
 */
package co.sabi11.main;

import co.sabi11.classes.CeilingFan;
import co.sabi11.classes.Light;
import co.sabi11.classes.RemoteControlWithUndo;
import co.sabi11.interfaces.implementation.CeilingFanHighCommand;
import co.sabi11.interfaces.implementation.CeilingFanMediumCommand;
import co.sabi11.interfaces.implementation.CeilingFanOffCommand;
import co.sabi11.interfaces.implementation.LightOffCommand;
import co.sabi11.interfaces.implementation.LightOnCommand;

/**
 * @author Sabi
 *
 */
public class RemoteLoader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		 
		Light livingRoomLight = new Light("Living Room");
 
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);
 
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
 
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

		CeilingFan ceilingFan = new CeilingFan("Living Room");
   
		CeilingFanMediumCommand ceilingFanMedium = 
				new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = 
				new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
  
		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
   
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
  
		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

	}

}
