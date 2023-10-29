//Pham Viet Hai - 20215044
package lab_01;

import javax.swing.JOptionPane; // enable dialog
public class ShowTwoNumbers {

	public static void main(String[] args) {
		String strNum1, strNum2;
		String strNotification = "You just entered: ";
		
		// Enter first number
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ","Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + " and ";
		
		// Enter second number
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ","Input the second number", JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2;
		
		// print out result
		JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}