//Pham Viet Hai 20215044
package lab_02;

import java.util.Comparator;

public interface MediaComparator extends Comparator<Media> {
    // This interface extends Comparator, so it must provide a compare method

    // Example method for comparing by title then cost
    default int compareByTitleCost(Media media1, Media media2) {
        int titleComparison = media1.getTitle().compareTo(media2.getTitle());
        return titleComparison != 0 ? titleComparison : Float.compare(media2.getCost(), media1.getCost());
    }

    // Example method for comparing by cost then title
    default int compareByCostTitle(Media media1, Media media2) {
        int costComparison = Float.compare(media2.getCost(), media1.getCost());
        return costComparison != 0 ? costComparison : media1.getTitle().compareTo(media2.getTitle());
    }
}

