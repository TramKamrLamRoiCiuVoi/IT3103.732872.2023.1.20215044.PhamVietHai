//Pham Viet Hai 20215044
package lab_01;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lay input chieu cao tam giac
        System.out.print("Enter the height of the triangle: ");
        int n = scanner.nextInt();

        // Hien thi tam giac
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // In dau *
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Chuyen den dong tiep theo
            System.out.println();
        }
    }
}

