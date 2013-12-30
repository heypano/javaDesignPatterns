package chapter1StrategyPattern;

/**
 * @author ppapadatos
 *
 */
public class FlyNormal implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println(Messages.getString("FlyNormal.0")); //$NON-NLS-1$
	}
}
