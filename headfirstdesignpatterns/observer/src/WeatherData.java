/**
 * 
 */


import java.util.ArrayList;
import co.sabi11.interfaces.Observer;
import co.sabi11.interfaces.Subject;

/**
 * @author Szabolcs
 * Implementation of the Subject interface 
 *
 */
public class WeatherData implements Subject {

	// Attributes with local focus (accessible)
	private ArrayList<Object> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	//Constructor
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	// each observer object is added to the list
	@Override
	public void registerObserver(Observer o) {
	
		observers.add(o);
	}
	
	// Remove observer object from the list
	@Override
	public void removeObserver(Observer o) {
		
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i);
		}
	}
	// Broadcasting message to all registered observers
	// with update function
	@Override
	public void notifyObservers() {
	
		for (int i = 0; i < observers.size(); i++ ) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
			
		}
	}
	
	// Notifying observers when data is updated
	public void measurementsChanged() {
		notifyObservers();
	}
	
	// Set method to test our display elements
	public void setMeasurements(float temperature, float humidity, float pressure) {
		
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
