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
public class StatisticsDisplay implements Observer, DisplayElement {

	//Attributes
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	
	/**
	 * Constructor with observable argument
	 */
	public StatisticsDisplay(Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
				+ "/" + maxTemp + "/" + minTemp);
		
	}

	@Override
	public void update(Observable observable, Object arg) {
		if(observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			float temp = weatherData.getTemperature();
			tempSum += temp;
			numReadings++;
			
			if(temp > maxTemp) {
				maxTemp = temp;
			}
			else {
				minTemp = temp;
			}
			
			display();
		}
		
	}

}
