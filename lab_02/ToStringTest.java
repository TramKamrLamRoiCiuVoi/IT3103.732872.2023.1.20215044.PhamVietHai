package lab_02;

import java.util.ArrayList;
import java.util.List;

public class ToStringTest {
    public static void main(String[] args) {
        List<Media> mediaList = new ArrayList<>();

        // Assuming you have instances of CompactDisc, DigitalVideoDisc, and Book
        CompactDisc cd = new CompactDisc("CD Title", "CD Artist");
        DigitalVideoDisc dvd = new DigitalVideoDisc("DVD Title", "DVD Category", "DVD Director", 120, 14.99f);
        Book book = new Book();

        mediaList.add(cd);
        mediaList.add(dvd);
        mediaList.add(book);

        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
    }
}

