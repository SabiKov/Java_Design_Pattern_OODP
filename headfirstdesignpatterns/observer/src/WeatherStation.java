import co.sabi11.displays.CurrentConditionsDisplay;
import co.sabi11.displays.ForecastDisplay;
import co.sabi11.displays.HeatIndexDisplay;
import co.sabi11.displays.StatisticsDisplay;

/**
 * 
 */

/**
 * @author Szabolcs
 *
 */
public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create weatherData object
		WeatherData weatherData = new WeatherData();

		@SuppressWarnings("unused")
		CurrentConditionsDisplay currentDisplay = 
				new CurrentConditionsDisplay(weatherData);
		@SuppressWarnings("unused")
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		@SuppressWarnings("unused")
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		@SuppressWarnings("unused")
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 15.4f);


	}

}
