/**
 * 
 */
package chapter2ObserverPattern;

import java.util.ArrayList;

/**
 * @author ppapadatos
 *
 */
public class WeatherData implements Subject {
	ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	/**
	 * 
	 */
	public WeatherData() {
		observers = new ArrayList<Observer>();
		this.temperature = -274;
		this.humidity= -274;
		this.pressure = -274;
	}

	@Override
	public void registerObserver(Observer ob) {
		observers.add(ob);

	}

	@Override
	public void removeObserver(Observer ob) {
		observers.remove(ob);
	}

	@Override
	public void notifyObservers() {
		for (Observer ob: observers){
			ob.update();
		}
	}

	/**
	 * @return the temperature
	 */
    public float getTemperature() {
	    return temperature;
    }

	/**
	 * @param temperature the temperature to set
	 */
    public void setTemperature(float temperature) {
	    this.temperature = temperature;
	    this.notifyObservers();
    }

	/**
	 * @return the humidity
	 */
    public float getHumidity() {
	    return humidity;
    }

	/**
	 * @param humidity the humidity to set
	 */
    public void setHumidity(float humidity) {
	    this.humidity = humidity;
	    this.notifyObservers();
    }

	/**
	 * @return the pressure
	 */
    public float getPressure() {
	    return pressure;
    }

	/**
	 * @param pressure the pressure to set
	 */
    public void setPressure(float pressure) {
	    this.pressure = pressure;
	    this.notifyObservers();
    }
	
    /**
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setWeatherData(float temperature, float humidity, float pressure){
    	this.temperature = temperature;
    	this.humidity = humidity;
    	this.pressure = pressure;
    	this.notifyObservers();
    }


}
