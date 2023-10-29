//Pham Viet Hai 20215044
package lab_01;

import javax.swing.JOptionPane;

public class Equation {

    public static void main(String[] args) {
        // Example usage:
        // solveFirstDegreeEquation();
        // solveLinearSystem();
        solveSecondDegreeEquation();
    }

    // ax + b = 0 (a != 0)
    public static void solveFirstDegreeEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient 'a':"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient 'b':"));

        if (a != 0) {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "The solution is x = " + x);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid input. 'a' cannot be zero.");
        }
    }

    // a11*x1 + a12*x2 = b1
    // a21*x1 + a22*x2 = b2
    public static void solveLinearSystem() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient 'a11':"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient 'a12':"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient 'b1':"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient 'a21':"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient 'a22':"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient 'b2':"));

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "The solutions are x1 = " + x1 + ", x2 = " + x2);
        } else if (D1 == 0 && D2 == 0) {
            JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.");
        } else {
            JOptionPane.showMessageDialog(null, "The system has no solution.");
        }
    }

    // ax^2 + bx + c = 0 (a != 0)
    public static void solveSecondDegreeEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient 'a':"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient 'b':"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient 'c':"));

        double delta = b * b - 4 * a * c;

        if (a != 0) {
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "The solutions are x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "The double root is x = " + x);
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no real roots.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid input. 'a' cannot be zero.");
        }
    }
}

