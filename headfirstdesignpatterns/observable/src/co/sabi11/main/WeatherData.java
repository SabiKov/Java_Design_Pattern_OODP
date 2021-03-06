package co.sabi11.main;
/**
 * 
 */


import java.util.Observable;

/**
 * @author Szabolcs
 * Observer design pattern implementation with 
 * built-in support features.
 *
 */
public class WeatherData extends Observable {
	
	//Attributes
	private float temperature;
	private float humidity;
	private float pressure;

	/**
	 * Default constructor, but not in usage this time
	 */
	public WeatherData() {}

	//Broadcasting notifications function
	public void measurementsChanged() {
		setChanged();  // checking the current state to notify or not!
		notifyObservers(); // Without parameter indicates Pull model. 
	}
	
	// Setting each parameters
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	//Getter methods are used by Observers
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
