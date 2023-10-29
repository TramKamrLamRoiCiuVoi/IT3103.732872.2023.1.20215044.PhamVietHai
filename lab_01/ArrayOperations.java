//Pham Viet Hai 20215044
package lab_01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
    	// Khởi tạo đối tượng Scanner để nhận input từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo đối tượng Scanner để nhận input từ người dùng
        System.out.println("Choose an option:");
        System.out.println("1. Use a constant array");
        System.out.println("2. Enter your own array");

        // Nhận lựa chọn từ người dùng
        int option = scanner.nextInt();

        int[] array;

        if (option == 1) {
        	// Sử dụng mảng cố định đã được khởi tạo
            array = new int[]{5, 3, 1, 7, 2, 4, 6};
        } else if (option == 2) {
        	// Nhập mảng từ người dùng
            System.out.print("Enter the length of the array: ");
            int length = scanner.nextInt();
            array = new int[length];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < length; i++) {
                array[i] = scanner.nextInt();
            }
        } else {
        	// Hiển thị thông báo khi lựa chọn không hợp lệ và thoát chương trình
            System.out.println("Invalid option. Exiting program.");
            return;
        }

        // Sắp xếp mảng
        Arrays.sort(array);

        // Tính tổng và trung bình cộng
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;

        // Hiển thị mảng đã sắp xếp, tổng và trung bình cộng
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Sum of Elements: " + sum);
        System.out.println("Average of Elements: " + average);
    }
}

