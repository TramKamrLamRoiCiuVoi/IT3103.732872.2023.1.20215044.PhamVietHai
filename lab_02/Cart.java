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
    
    // method add DVDs với tham số là array
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            addDigitalVideoDisc(disc);
        }
        System.out.println("DVDs have been added to the cart.");
    }
    
    // method add một số lượng DVD tùy ý
    public void addDigitalVideoDisc1(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            addDigitalVideoDisc(disc);
        }
        System.out.println("DVDs have been added to the cart.");
    }
    
    // method add số lượng DVD nhất định (2)
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
        System.out.println("DVDs have been added to the cart.");
    }
    
    // method in chi tiet thong tin dvd trong cart va tong gia tien
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:\n");

        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc disc = itemsOrdered[i];
            System.out.println((i + 1) + ". DVD - Title: " + disc.getTitle() + " | Category: " + disc.getCagetory() + " | Director: " + disc.getDirectory() + " | Length: " + disc.getLength() + " | Price: " + disc.getCost() + " $");
        }

        System.out.println("\nTotal cost: " + getTotalCost() + " $\n");
        System.out.println("***************************************************");
    }

    // methid tim dvd theo id
    public void searchById(int id) {
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc.getId() == id) {
                System.out.println("DVD found:\n" + ". DVD - Title: " + disc.getTitle() + " | Category: " + disc.getCagetory() + " | Director: " + disc.getDirectory() + " | Length: " + disc.getLength() + " | Price: " + disc.getCost() + " $");
                return;
            }
        }
        System.out.println("No matching DVD found with ID: " + id);
    }

    // method tim dvd theo title
    public void searchByTitle(String title) {
        System.out.println("Search results for DVDs with title '" + title + "':\n");
        boolean found = false;

        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc.isMatch(title)) {
                System.out.println("DVD - Title: " + disc.getTitle() + " | Category: " + disc.getCagetory() + " | Director: " + disc.getDirectory() + " | Length: " + disc.getLength() + " | Price: " + disc.getCost() + " $");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching DVDs found with title: " + title);
        }
    }
    
}
