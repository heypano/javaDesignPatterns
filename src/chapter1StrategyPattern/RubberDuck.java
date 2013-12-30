package chapter1StrategyPattern;

/**
 * @author ppapadatos
 *
 */
public class RubberDuck extends Duck {

	/**
	 * 
	 */
	public RubberDuck() {
		super();
		this.setFlyBehavior(new FlyNo());
	}

}
