//Pham Viet Hai - 20215044
package lab_02;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        // Compare by cost, then by title
        int costComparison = Float.compare(media2.getCost(), media1.getCost());
        return costComparison != 0 ? costComparison : media1.getTitle().compareTo(media2.getTitle());
    }
}
