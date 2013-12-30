package chapter1StrategyPattern;

/**
 * @author ppapadatos
 *
 */
public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		Duck thisDuck = new RubberDuck();
		thisDuck.performFly();
		thisDuck.setFlyBehavior(new FlyNormal());
		thisDuck.performFly();
	}

}
