// Pham Viet Hai 20215044
package lab_02;

public class Store {

    private DigitalVideoDisc itemsInStore[];

    public Store(int capacity) {
        itemsInStore = new DigitalVideoDisc[capacity];
    }

    // Method  add DVD vao store
    public void addDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] == null) {
                itemsInStore[i] = dvd;
                System.out.println("DVD added to the store: " + dvd.getTitle());
                return;
            }
        }
        System.out.println("Failed to add DVD. The store is full.");
    }

    // Method xoa DVD trong store
    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] == dvd) {
                itemsInStore[i] = null;
                System.out.println("DVD removed from the store: " + dvd.getTitle());
                return;
            }
        }
        System.out.println("DVD not found in the store: " + dvd.getTitle());
    }
    
    // method xem store
    public void display() {
        System.out.println("******************** DVDs in the Store ********************");
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] != null) {
                System.out.println("DVD " + (i + 1) + ":");
                System.out.println("  Title: " + itemsInStore[i].getTitle());
                System.out.println("  Category: " + itemsInStore[i].getCagetory());
                System.out.println("  Director: " + itemsInStore[i].getDirectory());
                System.out.println("  Length: " + itemsInStore[i].getLength());
                System.out.println("  Price: " + itemsInStore[i].getCost() + " $");
                System.out.println("-------------------------------------------------------");
            } else {
                System.out.println("DVD " + (i + 1) + ": Empty slot");
                System.out.println("-------------------------------------------------------");
            }
        }
        System.out.println("***********************************************************");
    }
}


