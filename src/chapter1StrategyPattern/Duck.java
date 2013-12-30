package chapter1StrategyPattern;

/**
 * @author ppapadatos
 *
 */
public class Duck {
	private FlyBehavior flyBehavior;
	/**
	 * 
	 */
	public Duck() {
		flyBehavior = new FlyNormal(); 
	}

	/**
	 * 
	 */
	public void performFly(){
		flyBehavior.fly();
	}
	
	/**
	 * @return the flyBehavior
	 */
    public FlyBehavior getFlyBehavior() {
	    return flyBehavior;
    }
    
	/**
	 * @param flyBehavior the flyBehavior to set
	 */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
	    this.flyBehavior = flyBehavior;
    }

}
