package lab_02;

import java.util.ArrayList;

public class Manager {
    private ArrayList<Order> orders;

    // Đăng nhập và kiểm tra quyền
    public boolean login(String username, String password) {
        // Add your login logic here
        return true; // Return true if login is successful, otherwise false
    }

    // Xem danh sách các đơn hàng đang chờ xử lý
    public void viewPendingOrders() {
        for (Order order : orders) {
            if (order.getStatus().equals("Pending")) {
                System.out.println("Order ID: " + order.getOrderId() + ", Customer: " + order.getCustomerName());
            }
        }
    }

    // Xem chi tiết 1 đơn hàng và xử lý nó (đồng ý hoặc từ chối đặt hàng)
    public void processOrder(int orderId, boolean approve) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                if (approve) {
                    order.setStatus("Approved");
                    System.out.println("Order " + orderId + " has been approved.");
                } else {
                    order.setStatus("Rejected");
                    System.out.println("Order " + orderId + " has been rejected.");
                }
                return;
            }
        }
        System.out.println("Order " + orderId + " not found.");
    }

    // Thêm DVD vào danh sách sản phẩm
    public void addDVD(DigitalVideoDisc dvd) {
        // Add DVD to your list
    }

    // Xóa DVD khỏi danh sách sản phẩm
    public void removeDVD(DigitalVideoDisc dvd) {
        // Remove DVD from your list
    }
}
