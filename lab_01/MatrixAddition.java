//Pham Viet Hai 20215044
package lab_01;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
    	// Khởi tạo đối tượng Scanner để nhận input từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Hiển thị menu lựa chọn sử dụng ma trận cố định hoặc nhập từ người dùng
        System.out.println("Choose an option:");
        System.out.println("1. Use constant matrices");
        System.out.println("2. Enter your own matrices");

        // Nhận lựa chọn từ người dùng
        int option = scanner.nextInt();

        int[][] matrix1;
        int[][] matrix2;

        if (option == 1) {
        	// Sử dụng các ma trận cố định đã được khởi tạo
            matrix1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            matrix2 = new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        } else if (option == 2) {
        	// Nhập các ma trận từ người dùng
            matrix1 = inputMatrix("Matrix 1", scanner);
            matrix2 = inputMatrix("Matrix 2", scanner);
        } else {
        	// Hiển thị thông báo khi lựa chọn không hợp lệ và thoát chương trình
            System.out.println("Invalid option. Exiting program.");
            return;
        }

        // Kiểm tra xem các ma trận có cùng kích thước không
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices must be of the same size for addition. Exiting program.");
            return;
        }

        // Thực hiện phép cộng các ma trận
        int[][] resultMatrix = addMatrices(matrix1, matrix2);

        // Hiển thị ma trận kết quả
        System.out.println("Resultant Matrix:");
        printMatrix(resultMatrix);
    }

    // Hàm nhận input cho một ma trận
    private static int[][] inputMatrix(String name, Scanner scanner) {
        System.out.println("Enter the dimensions of " + name + " (rows columns): ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of " + name + ": ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    // Hàm thực hiện phép cộng hai ma trận
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // Hàm in ra một ma trận
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

