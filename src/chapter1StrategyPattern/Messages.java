package chapter1StrategyPattern;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * @author ppapadatos
 *
 */
public class Messages {
	private static final String BUNDLE_NAME = "chapter1StrategyPattern.messages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private Messages() {
	}

	/**
	 * @param key
	 * @return the string
	 */
	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
