// Pham VIet Hai 20215044
package lab_02;

public class CartTest {

	public static void main(String[] args) {
		// Tao cart moi
		Cart cart = new Cart();
		
		// Tao dvd moi va add vao cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "Roger Allers",87, 18.99f);
		cart.addMedia(dvd3);
		
		// Test method print
		cart.print();
		
		// Test method search theo id
		cart.searchById(1);
		
		// Test method serach theo title
		cart.searchByTitle("The Lion King");
		cart.searchByTitle("abc");
	}

}
