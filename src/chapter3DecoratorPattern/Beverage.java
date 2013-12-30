package chapter3DecoratorPattern;

/**
 * @author ppapadatos
 *
 */
public abstract class Beverage {
	protected String description = Messages.getString("Beverage.0"); //$NON-NLS-1$
	
	/**
	 * @return the description string
	 */
	public String getDescription(){
		return description;
	}
	
	/**
	 * @return the cost calculator
	 */
	public abstract double cost();

}
