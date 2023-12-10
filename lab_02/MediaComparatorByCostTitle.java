//Pham Viet Hai - 20215044
package lab_02;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        // Compare by title, then by cost
        int titleComparison = media1.getTitle().compareTo(media2.getTitle());
        return titleComparison != 0 ? titleComparison : Float.compare(media2.getCost(), media1.getCost());
    }
}
