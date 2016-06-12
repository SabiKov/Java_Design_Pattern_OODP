/**
 * 
 */
package co.sabi11.interfaces;

/**
 * @author Szabolcs
 *
 */
public interface Subject {

	// Two methods take an Observer argument, either register or remove 
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	// Whenever change occurs then all observers are notified
	public void notifyObservers();
}
