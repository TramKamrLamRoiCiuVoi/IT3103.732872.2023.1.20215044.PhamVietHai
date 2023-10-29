//Pham Viet Hai 20215044
package lab_01;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		// Khởi tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
		Scanner keyboard = new Scanner(System.in);
		
		// Yêu cầu người dùng nhập tên và đọc chuỗi ký tự từ bàn phím
		System.out.println("What's your name?");
		String strName = keyboard.nextLine();
		
		// Yêu cầu người dùng nhập tuổi và đọc số nguyên từ bàn phím
		System.out.println("How old are you?");
		int iAge = keyboard.nextInt();
		
		// Yêu cầu người dùng nhập chiều cao và đọc số thực từ bàn phím
		System.out.println("How tall are you (m)?");
		double dHeight = keyboard.nextDouble();
		
		// Hiển thị thông tin người dùng bao gồm tên, tuổi và chiều cao
		System.out.println("Mrs/Mr. " + strName + ", " + iAge + " years old." + "Your height is " + dHeight + ".");
		
	}

}
