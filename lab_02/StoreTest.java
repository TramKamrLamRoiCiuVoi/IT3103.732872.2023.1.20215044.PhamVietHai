// Pham Viet Hai 20215044
package lab_02;

public class StoreTest {

    public static void main(String[] args) {
        // tao store voi 5 dvd
        Store store = new Store(5);

        // tao dvd moi
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD1", "Category1", "Director1", 120, 10.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD2", "Category2", "Director2", 90, 8.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("DVD3", "Category3", "Director3", 150, 12.99f);

        // add dvd
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // xem store
        System.out.println("Current state of the store:");
        store.display();

        // test method removeDVD
        store.removeDVD(dvd2);

        // xem store
        System.out.println("Updated state of the store:");
        store.display();
    }

    
}

