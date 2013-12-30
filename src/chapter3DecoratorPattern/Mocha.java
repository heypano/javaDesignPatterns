/**
 * 
 */
package chapter3DecoratorPattern;

/**
 * @author ppapadatos
 *
 */
public class Mocha extends CondimentDecorator {
	protected Beverage beverage;
	protected String name;
	/**
	 * @param beverage 
	 * 
	 */
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		this.name = Messages.getString("Mocha.0"); //$NON-NLS-1$
	}


	@Override
	public double cost() {
		return .20 + this.beverage.cost();
	}


	@Override
    public String getDescription() {
		return this.beverage.getDescription()+Messages.getString("CondimentDecorator.0")+this.name; //$NON-NLS-1$
    }

}
