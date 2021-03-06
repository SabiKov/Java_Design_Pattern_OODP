/**
 * 
 */
package co.sabi11.main;


import co.sabi11.display.CurrentConditionsDisplay;
import co.sabi11.display.ForecastDisplay;
import co.sabi11.display.HeatIndexDisplay;
import co.sabi11.display.StatisticsDisplay;

/**
 * @author Szabolcs
 *
 */
public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		
		@SuppressWarnings("unused")
		CurrentConditionsDisplay currentConditionDisplay = new CurrentConditionsDisplay(weatherData);
		@SuppressWarnings("unused")
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		@SuppressWarnings("unused")
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		@SuppressWarnings("unused")
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
