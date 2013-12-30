/**
 * 
 */
package chapter3DecoratorPattern;

/**
 * @author ppapadatos
 *
 */
public class Espresso extends Beverage {

	/**
	 * 
	 */
	public Espresso() {
		description = Messages.getString("Espresso.0"); //$NON-NLS-1$
	}

	/* (non-Javadoc)
	 * @see chapter3DecoratorPattern.Beverage#cost()
	 */
	@Override
	public double cost() {
		return 1.99;
	}

}
