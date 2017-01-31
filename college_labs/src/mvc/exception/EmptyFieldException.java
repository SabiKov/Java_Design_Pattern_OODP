package mvc.exception;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EmptyFieldException extends RuntimeException {

	private String message;
	public EmptyFieldException() {
		super();
	}
	
	public EmptyFieldException(String msg) {
		super(msg);
		
		JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, msg);
		
	}
	
	
}
