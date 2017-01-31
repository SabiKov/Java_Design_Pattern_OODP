package mvc.view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import mvc.base.AbstractFrame;

public class InputView extends AbstractFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7181352316587582388L;
	private JButton addBtn, refreshBtn;
	private JTextField inputField;
	
	
	public InputView(String frameTitle) {
		super(frameTitle);
		
		//Create button object
		addBtn = new JButton("Add");
		refreshBtn = new JButton("Refresh");
		
		//Create text field
		inputField = new JTextField(20);
		
		mainPanel.add(addBtn, BorderLayout.NORTH);
		mainPanel.add(refreshBtn, BorderLayout.SOUTH);
		mainPanel.add(inputField, BorderLayout.CENTER);
	}

	public String getInputValue() {
		return inputField.getText();
	}
	
	//Controller calls this method
	public void addInputValueListener(ActionListener listenForAddButton) {
		addBtn.addActionListener(listenForAddButton);
	}
	
	public void refreshHobbyListListener(ActionListener listenForRefresh) {
		refreshBtn.addActionListener(listenForRefresh);
	}
	
	//Generating popup dialog
	public void displayErrorMessage(String errorMessage) {
		JOptionPane.showConfirmDialog(this, errorMessage);
	}
}
