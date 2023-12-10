// Pham Viet Hai 20215044
package lab_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cart {
    
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    // Số lượng đối tượng tối đa trong giỏ hàng
    public static final int MAX_NUMBERS_ORDERED = 20;

    // Phương thức thêm một đối tượng vào giỏ hàng
    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("The media has been added to the cart.");
        } else {
            System.out.println("Failed to add media. The cart is full.");
        }
    }

    // Phương thức loại bỏ một đối tượng khỏi giỏ hàng
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("The media has been removed from the cart.");
        } else {
            System.out.println("The media was not found in the cart.");
        }
    }

    // Phương thức tính tổng chi phí của các đối tượng trong giỏ hàng
    public float totalCost() {
        float totalCost = 0.0f;
        for (Media media : itemsOrdered) {
            totalCost += media.getCost();
        }
        return totalCost;
    }

    // Các phương thức in chi tiết thông tin đối tượng trong giỏ hàng
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:\n");

        for (int i = 0; i < itemsOrdered.size(); i++) {
            Media media = itemsOrdered.get(i);
            System.out.println((i + 1) + ". Media - Title: " + media.getTitle() + " | Category: " + media.getCategory() + " | Cost: " + media.getCost() + " $");
        }

        System.out.println("\nTotal cost: " + totalCost() + " $\n");
        System.out.println("***************************************************");
    }

    // Các phương thức tìm kiếm đối tượng theo ID và tiêu đề
    public void searchById(int id) {
        for (Media media : itemsOrdered) {
            if (media instanceof DigitalVideoDisc && ((DigitalVideoDisc) media).getId() == id) {
                System.out.println("DVD found:\n" + ". DVD - Title: " + media.getTitle() + " | Category: " + media.getCategory() + " | Cost: " + media.getCost() + " $");
                return;
            } else if (media instanceof Book && ((Book) media).getId() == id) {
                System.out.println("Book found:\n" + ". Book - Title: " + media.getTitle() + " | Category: " + media.getCategory() + " | Cost: " + media.getCost() + " $");
                return;
            } else if (media instanceof CompactDisc) {
                // Handle CompactDisc search if needed
            }
        }
        System.out.println("No matching media found with ID: " + id);
    }

    // Phương thức tìm kiếm đối tượng theo tiêu đề
    public Media searchByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        System.out.println("No matching media found with title: " + title);
        return null;
    }

    // Phương thức phát media từ giỏ hàng
    public void playMedia(String title) {
        Media media = searchByTitle(title);

        if (media != null && media instanceof Playable) {
            ((Playable) media).play();
        } else {
            System.out.println("Cannot play this type of media or media not found with title: " + title);
        }
    }

    // Method to filter media in the cart by ID
    public void filterById(int id) {
        ArrayList<Media> filteredMedia = new ArrayList<>();
        for (Media media : itemsOrdered) {
            if (media instanceof DigitalVideoDisc && ((DigitalVideoDisc) media).getId() == id) {
                filteredMedia.add(media);
            } else if (media instanceof Book && ((Book) media).getId() == id) {
                filteredMedia.add(media);
            } else if (media instanceof CompactDisc) {
                // Handle CompactDisc filter if needed
            }
        }

        if (!filteredMedia.isEmpty()) {
            System.out.println("Filtered Media in Cart by ID " + id + ":");
            for (Media media : filteredMedia) {
                System.out.println("Title: " + media.getTitle() + " | Category: " + media.getCategory() + " | Cost: " + media.getCost() + " $");
            }
        } else {
            System.out.println("No matching media found in cart with ID: " + id);
        }
    }

    // Method to filter media in the cart by title
    public void filterByTitle(String title) {
        ArrayList<Media> filteredMedia = new ArrayList<>();
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                filteredMedia.add(media);
            }
        }

        if (!filteredMedia.isEmpty()) {
            System.out.println("Filtered Media in Cart by Title '" + title + "':");
            for (Media media : filteredMedia) {
                System.out.println("Title: " + media.getTitle() + " | Category: " + media.getCategory() + " | Cost: " + media.getCost() + " $");
            }
        } else {
            System.out.println("No matching media found in cart with title: " + title);
        }
    }

    // Method to sort media in the cart by title
    public void sortByTitle() {
        Collections.sort(itemsOrdered, Comparator.comparing(Media::getTitle));
        System.out.println("Cart sorted by Title.");
    }

    // Method to sort media in the cart by cost
    public void sortByCost() {
        Collections.sort(itemsOrdered, Comparator.comparing(Media::getCost));
        System.out.println("Cart sorted by Cost.");
    }

    // Method to remove media from the cart by title
    public void removeMedia(String title) {
        Media media = searchByTitle(title);
        if (media != null) {
            removeMedia(media);
            System.out.println("Media removed from cart: " + title);
        } else {
            System.out.println("Media not found in cart with title: " + title);
        }
    }
    
    public void clear() {
        itemsOrdered.clear();
        System.out.println("Cart cleared.");
    }
}



