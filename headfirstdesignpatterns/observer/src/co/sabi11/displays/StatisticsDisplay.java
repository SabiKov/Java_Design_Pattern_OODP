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
public class StatisticsDisplay implements Observer, DisplayElement {

	// Attributes with this class "local" scope accessible
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	@SuppressWarnings("unused")
	private Subject weatherData;
	
	//Constructor
	public StatisticsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		
	}

	@Override
	public void update(float temperature, float humadity, float pressure) {
		
		tempSum += temperature;
		numReadings++;
		
		 if(temperature > maxTemp) { 
			maxTemp = temperature;  
		}
		else { 
			minTemp = temperature; 
		}
		 
		display();
	}
	

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
				+ "/" + maxTemp + "/" + minTemp);
		
	}
}
