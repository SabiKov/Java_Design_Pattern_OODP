package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * This is an online tutorial
 * ref: https://www.youtube.com/watch?v=dTVVa2gfht8
 * */

public class CalculatorView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField firstNumber = new JTextField(10);
	private JLabel additionalLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	
	
	public CalculatorView() {
		
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		calcPanel.add(firstNumber);
		calcPanel.add(additionalLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);	
		
		this.add(calcPanel);
	}
	
	// Read in the textField's value
	public int getFirstNumber() {
		
		return Integer.parseInt(firstNumber.getText());
	}
	
	// Read in the textField's value
	public int getSecondNumber() {
		
		return Integer.parseInt(secondNumber.getText());
	}
	
	// Read in the textField's value
	public int getCalcSolution() {
		
		return Integer.parseInt(calcSolution.getText());
	}
	
	//Controller class sets this value
	public void setCalcSolution(int solution) {
		
		calcSolution.setText(Integer.toString(solution));
	}
	
	// Add action listener to button
	public void addCalculationListener(ActionListener listenerForCalcButton) {
		
		calculateButton.addActionListener(listenerForCalcButton);
	}
	
	public void displayErrorMessage(String errorMessage) {
		
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}