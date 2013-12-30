/**
 * 
 */
package chapter2ObserverPattern;

/**
 * @author ppapadatos
 *
 */
public class RandomDisplayThingie implements Observer {
	private Subject subject;
	/**
	 * @param subject 
	 * 
	 */
	public RandomDisplayThingie(Subject subject) {
		setSubject(subject);
	}

	@Override
	public void update() {
		display();
	}
	
	/**
	 * 
	 */
	public void display(){
		if(this.subject instanceof WeatherData){
			WeatherData weatherData = (WeatherData) subject;
			System.out.println(Messages.getString("RandomDisplayThingie.0")+weatherData.getTemperature()); //$NON-NLS-1$
		}
	}
	
	/**
	 * @return the subject
	 */
    public Subject getSubject() {
	    return subject;
    }

	/**
	 * @param subject the subject to set
	 */
    public void setSubject(Subject subject) {
	    this.subject = subject;
    }

}
