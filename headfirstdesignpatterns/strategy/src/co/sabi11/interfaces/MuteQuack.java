/**
 * 
 */
package co.sabi11.interfaces;

/**
 * @author Sabi
 *
 */
public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		
		System.out.println("<< Silence >>");
		
	}
	
}
