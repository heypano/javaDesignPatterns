/**
 * 
 */
package chapter3DecoratorPattern;

/**
 * @author ppapadatos
 *
 */
public class StarbuzzCoffee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		printStuff(beverage);
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Soy(beverage2);
		printStuff(beverage2);

	}
	
	/**
	 * @param beverage
	 */
	public static void printStuff(Beverage beverage){
		System.out.println(beverage.getDescription()+Messages.getString("StarbuzzCoffee.0")+beverage.cost()); //$NON-NLS-1$
	}

}
