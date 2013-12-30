package chapter1StrategyPattern;

/**
 * @author ppapadatos
 *
 */
public class FlyNo implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println(Messages.getString("FlyNo.0")); //$NON-NLS-1$

	}

}
