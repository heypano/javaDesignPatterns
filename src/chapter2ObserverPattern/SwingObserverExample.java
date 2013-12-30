package chapter2ObserverPattern;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author ppapadatos
 *
 */
public class SwingObserverExample {
		JFrame frame;
		
		/**
		 * @param args
		 */
		public static void main(String[] args){
			SwingObserverExample example = new SwingObserverExample();
			example.go();
		}
		
		/**
		 * 
		 */
		public void go(){
			frame = new JFrame();
			
			JButton button = new JButton(Messages.getString("SwingObserverExample.0")); //$NON-NLS-1$
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(Messages.getString("SwingObserverExample.1")); //$NON-NLS-1$
				}
			});
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(Messages.getString("SwingObserverExample.2")); //$NON-NLS-1$
				}
			});
			frame.getContentPane().add(BorderLayout.CENTER, button);
			frame.pack();
			frame.setVisible(true);
		}

}
