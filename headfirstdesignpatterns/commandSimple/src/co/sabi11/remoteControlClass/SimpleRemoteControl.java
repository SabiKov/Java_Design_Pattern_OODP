package co.sabi11.remoteControlClass;

import co.sabi11.intefaces.Command;

public class SimpleRemoteControl {

	Command slot;
	
	public SimpleRemoteControl() {
	}

	/*
	 * Method for setting the command.
	 * */
	public void setCommand(Command command) {
		slot = command;
	}
	
	/*
	 * Method is triggered by button is pressed
	 * */
	public void buttonwasPressed() {
		slot.execute();
	}
}
