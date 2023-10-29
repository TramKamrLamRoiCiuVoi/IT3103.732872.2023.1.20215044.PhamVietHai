//Pham Viet Hai 20215044
package lab_01;

import javax.swing.JOptionPane;

public class ChoosingOption {

	public static void main(String[] args) {
		// Hiển thị hộp thoại xác nhận với các lựa chọn (Có/Không/Hủy)
		int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
		
		// Hiển thị hộp thoại thông báo hiển thị lựa chọn của người dùng (Có hoặc Không)
		JOptionPane.showMessageDialog(null, "You've chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
		
		// Kết thúc chương trình với mã trạng thái 0 (thực thi thành công)
		System.exit(0);

	}

}
