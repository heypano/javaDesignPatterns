/**
 * 
 */
package chapter3DecoratorPattern;

/**
 * @author ppapadatos
 *
 */
public class HouseBlend extends Beverage {

	/**
	 * 
	 */
	public HouseBlend() {
		description = Messages.getString("HouseBlend.0"); //$NON-NLS-1$
	}

	/* (non-Javadoc)
	 * @see chapter3DecoratorPattern.Beverage#cost()
	 */
	@Override
	public double cost() {
		return .89;
	}

}
