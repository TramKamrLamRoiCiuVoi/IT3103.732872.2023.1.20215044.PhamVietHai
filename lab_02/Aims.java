// Pham Viet Hai 20215044
package lab_02;

public class Aims {
    public static void main(String[] args) {
    	// Tạo một đối tượng giỏ hàng mới
        Cart anOrder = new Cart();
        
        // Tạo và thêm vào giỏ hàng đĩa dvd1
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        
        // Tạo và thêm vào giỏ hàng đĩa dvd2
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        
        // Tạo và thêm vào giỏ hàng đĩa dvd3
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        
        // Loại bỏ đĩa dvd3 khỏi giỏ hàng
        anOrder.removeDigitalVideoDisc(dvd3);
        
        // In ra tổng chi phí của các đĩa trong giỏ hàng
        System.out.println("Total Cost is: " + anOrder.getTotalCost());
    }
}

// test for branch refactor/apply-release-flow
