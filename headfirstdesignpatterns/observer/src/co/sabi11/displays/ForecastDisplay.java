package co.sabi11.displays;

import co.sabi11.interfaces.DisplayElement;
import co.sabi11.interfaces.Observer;
import co.sabi11.interfaces.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
	
	// Attributes
	private float currentPressure = 29.92f;
	private float lastPressure;
	@SuppressWarnings("unused")
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
	
	// update arguments
	@Override
	public void update(float temperature, float humidity, float pressure) {
		
		lastPressure = currentPressure;
		currentPressure = pressure;
		
		display();
	}

}
