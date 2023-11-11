// Pham Viet Hai 20215044
package lab_02;

import lab_02.DigitalVideoDisc;

public class Cart {
	
	// Số lượng đĩa tối đa trong giỏ hàng
	public static final int MAX_NUMBERS_ORDERED = 20;
	
	// Mảng lưu trữ các đĩa được đặt hàng
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	// Số lượng đĩa đã đặt hàng
	private int qtyOrdered = 0;
	
	// Phương thức thêm một đĩa vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("Failed to add disc. The cart is full.");
        }
    }
    
    // Phương thức loại bỏ một đĩa khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int index = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < qtyOrdered - 1; i++) {
                itemsOrdered[i] = itemsOrdered[i + 1];
            }
            itemsOrdered[qtyOrdered - 1] = null;
            qtyOrdered--;
            System.out.println("The disc has been removed.");
        } else {
            System.out.println("The disc was not found in the cart.");
        }
    }
    
    // Phương thức tính tổng chi phí của các đĩa trong giỏ hàng
    public float getTotalCost() {
        float totalCost = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
    }
    
}
