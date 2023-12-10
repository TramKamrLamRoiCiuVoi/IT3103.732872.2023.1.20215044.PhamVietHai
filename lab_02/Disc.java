//Pham Viet Hai - 20215044
package lab_02;

public class Disc extends Media {
    
    protected int length;
    private String director;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Disc() {
        // Default constructor
    }

    public Disc(int length, String director) {
        super();
        this.length = length;
        this.director = director;
    }

    @Override
    public int compareTo(Media otherMedia) {
        // Compare by title
        return this.getTitle().compareTo(otherMedia.getTitle());
    }
}

