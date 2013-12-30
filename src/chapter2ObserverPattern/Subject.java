/**
 * 
 */
package chapter2ObserverPattern;

/**
 * @author ppapadatos
 *
 */
public interface Subject {
	/**
	 * @param ob 
	 * 
	 */
	public void registerObserver(Observer ob);
	
	/**
	 * @param ob 
	 * 
	 */
	public void removeObserver(Observer ob);

	/**
	 * 
	 */
	public void notifyObservers();

}
