/**
 * 
 */
package observerswing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Szabolcs
 *
 */
public class SwingObserverexmaple {

	JFrame frame;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingObserverexmaple example = new SwingObserverexmaple();
		example.go();
	}
	
	public void go() {
		frame = new JFrame();
		JButton btn = new JButton("Should I do it?");
		btn.addActionListener(new AngelListener());
		btn.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, btn);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
	// Observer of the btn swing object
	class AngelListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			System.out.println("Don't do it, you might regret it!");
		}
	}
	// Observer of the btn swing object
	class DevilListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			System.out.println("Come on, do it!");
		}
	}
}
