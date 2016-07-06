/**
 * 
 */
package co.sabi11.interfaces.implementation;

import co.sabi11.interfaces.Command;

/**
 * @author Sabi
 *
 */
public class NoCommand implements Command {
	
	@Override
	public void execute() { }
	
	@Override
	public void undo() { }

}
