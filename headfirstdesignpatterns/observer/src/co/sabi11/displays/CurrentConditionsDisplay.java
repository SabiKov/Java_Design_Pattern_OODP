/**
 * 
 */
package co.sabi11.displays;

import co.sabi11.interfaces.DisplayElement;
import co.sabi11.interfaces.Observer;
import co.sabi11.interfaces.Subject;

/**
 * @author Szabolcs
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	@SuppressWarnings("unused")
	private Subject weatherData;
	 
	
	/*
	 * Constructor is passed the weatherData object,
	 * and it is registered as an observer 
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {	
		System.out.println("Current conditions: " + temperature + " F degrees and" + humidity + " % humidity " +
				pressure + ": pressure");
	}

	/*
	 * Update arguments and call display method 
	 * */
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.pressure = pressure;
		this.temperature = temperature;
		this.humidity = humidity;
		display();
		
	}

}
