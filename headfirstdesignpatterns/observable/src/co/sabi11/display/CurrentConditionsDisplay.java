/**
 * 
 */
package co.sabi11.display;

import java.util.Observable;
import java.util.Observer;

import co.sabi11.interfaces.DisplayElement;
import co.sabi11.main.WeatherData;

/**
 * @author Szabolcs
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	//Attributes
	Observable observable;
	private float temperature;
	private float humidity;
	
	
	/**
	 * Constructor
	 */
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this); // add observer
	}

	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.humidity = weatherData.getHumidity();
			this.temperature = weatherData.getTemperature();
			display();
			
		}
	}

	@Override
	public void display() {
		
		System.out.println("Current condiditions: " + temperature + " F degrees and " + humidity + " % humidity");
	}

}
