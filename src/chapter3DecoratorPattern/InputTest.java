/**
 * 
 */
package chapter3DecoratorPattern;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author ppapadatos
 *
 */
public class InputTest {

	private static InputStream in;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int c;
		try{
			in = new LowerCaseInputStream(
					new BufferedInputStream(
							new FileInputStream("src/chapter3DecoratorPattern/test.txt") //$NON-NLS-1$
					)
			);
			while((c = in.read()) >= 0){
				System.out.print((char) c);
			}
			in.close();
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
