package chapter3DecoratorPattern;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * @author ppapadatos
 *
 */
public class Messages {
	private static final String BUNDLE_NAME = "chapter3DecoratorPattern.messages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private Messages() {
	}

	/**
	 * @param key
	 * @return the String
	 */
	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
