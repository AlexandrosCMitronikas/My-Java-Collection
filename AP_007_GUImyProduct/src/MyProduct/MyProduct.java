package MyProduct;

import javax.swing.JOptionPane;

public class MyProduct {

	public static void main(String[] args) {
		String firstNumber = JOptionPane.showInputDialog("Enter the first number");
		String secondNumber = JOptionPane.showInputDialog("Enter the second number");
		
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);
		
		int product = number1 * number2;
		
		JOptionPane.showMessageDialog(null, "The product of the numbers is " + product + ".", "Product of two integers", JOptionPane.PLAIN_MESSAGE);
	}

}
