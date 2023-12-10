// Pham Viet Hai 20215044
package lab_02;

import java.util.ArrayList;

public class Store {

    private ArrayList<Media> itemsInStore;

    // Constructor with capacity
    public Store(int capacity) {
        itemsInStore = new ArrayList<>(capacity);
    }

    // Method add Media to store
    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Media added to the store: " + media.getTitle());
    }

    // Method remove Media from store
    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("Media removed from the store: " + media.getTitle());
        } else {
            System.out.println("Media not found in the store: " + media.getTitle());
        }
    }

    // Method to display store content
    public void display() {
        System.out.println("******************** Media in the Store ********************");
        for (int i = 0; i < itemsInStore.size(); i++) {
            Media media = itemsInStore.get(i);
            System.out.println("Media " + (i + 1) + ":");
            System.out.println("  Title: " + media.getTitle());
            System.out.println("  Category: " + media.getCategory());
            System.out.println("  Cost: " + media.getCost() + " $");
            System.out.println("-------------------------------------------------------");
        }
        System.out.println("***********************************************************");
    }

    // Method to search media by title
 // Method to search media by title
    public Media searchByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.isMatch(title)) {
                return media;
            }
        }

        System.out.println("No matching media found with title: " + title);
        return null;
    }

}




