/**
 * 
 */
package co.sabi11.interfaces;

/**
 * @author Szabolcs
 *
 */
public interface Observer {
	// The Observer's interface is implemented by all observers, 
	// therefore all observers contain the implementation of 
	// update function.  
	public void update(float temp, float humadity, float pressure);

}
