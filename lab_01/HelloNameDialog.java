package lab_01;
//Pham Viet Hai - 20215044
import javax.swing.JOptionPane; // enable dialog 
public class HelloNameDialog {

	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog("Please enter your name: "); // Enter name
		JOptionPane.showMessageDialog(null, "Hi " + result + "!");
		System.exit(0); 
	}

}
