/**
 * 
 */
package chapter2ObserverPattern;

/**
 * @author ppapadatos
 *
 */
public class WeatherThingieSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		RandomDisplayThingie rdt = new RandomDisplayThingie(wd);
		wd.registerObserver(rdt);
		wd.setWeatherData(12, 12, 12);
		wd.setWeatherData(13, 11, 12);
		wd.setWeatherData(11, 13, 12);
	}

}
