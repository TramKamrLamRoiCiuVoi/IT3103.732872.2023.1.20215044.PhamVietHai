//Pham Viet Hai 20215044
package lab_01;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month;
        int year;
        int daysInMonth = -1;

        // Nhap va kiem tra du lieu
        do {
        	// Hiển thị thông báo yêu cầu người dùng nhập tháng (1-12 hoặc tên/viết tắt)
            System.out.print("Enter the month (1-12 or name/abbreviation): ");
            String inputMonth = scanner.nextLine();
            month = getMonth(inputMonth);
            
            // Thông báo nếu tháng không hợp lệ và yêu cầu người dùng nhập lại
            if (month == -1) {
                System.out.println("Invalid month input. Please try again.");
                continue;
            }
            
            // Yêu cầu người dùng nhập năm (4 chữ số)
            System.out.print("Enter the year (4 digits): ");
            year = scanner.nextInt();
            scanner.nextLine(); // Nhan dong tiep theo

            if (!isValidYear(year)) {
            	// Thông báo nếu năm không hợp lệ và yêu cầu người dùng nhập lại
                System.out.println("Invalid year input. Please try again.");
                continue;
            }

            daysInMonth = getDaysInMonth(month, year);
            
            // Thông báo nếu tháng hoặc năm không hợp lệ và yêu cầu người dùng nhập lại
            if (daysInMonth == -1) {
                System.out.println("Invalid month or year. Please try again.");
            } else {
            	// Hiển thị số ngày trong tháng
                System.out.println("Number of days in the month: " + daysInMonth);
            }
        } while (daysInMonth == -1);
    }
    
    // Output ngay
    private static int getMonth(String input) {
    	// Mảng chứa tên các tháng và viết tắt của chúng
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        String[] monthAbbreviations = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", 
        		"Oct.", "Nov.", "Dec."};
        
        if (input.matches("\\d+")) {
        	// Nếu người dùng nhập số, kiểm tra xem có trong khoảng từ 1 đến 12 không
            int monthNumber = Integer.parseInt(input);
            if (monthNumber >= 1 && monthNumber <= 12) {
                return monthNumber;
            }
        } else {
        	// Nếu người dùng nhập chuỗi, kiểm tra xem có phải là tên hoặc viết tắt của tháng không
            for (int i = 0; i < months.length; i++) {
                if (input.equalsIgnoreCase(months[i]) || input.equalsIgnoreCase(monthAbbreviations[i])) {
                    return i + 1;
                }
            }
        }

        // Trả về -1 nếu không phù hợp với bất kỳ tháng nào
        return -1;
    }

    private static boolean isValidYear(int year) {
    	// Kiểm tra xem năm có hợp lệ không (4 chữ số)
        return year >= 0 && String.valueOf(year).length() == 4;
    }

    private static int getDaysInMonth(int month, int year) {
    	// Mảng chứa số ngày của từng tháng
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Kiểm tra xem tháng có phải tháng 2 trong năm nhuận không và trả về số ngày tương ứng
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        // Trả về số ngày của tháng
        if (month >= 1 && month <= 12) {
            return daysInMonth[month - 1];
        }

        return -1;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}


