//Pham Viet Hai - 20215044
package lab_02;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

	@Override
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
		
	}
	
	@Override
	public boolean equals(Object obj) {
	    // Check if the object is compared with itself
	    if (this == obj) {
	        return true;
	    }

	    // Check if the object is null or of a different class
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }

	    // Cast the object to Track
	    Track otherTrack = (Track) obj;

	    // Check if the titles and lengths are equal
	    return this.title != null ? this.title.equals(otherTrack.title) : otherTrack.title == null &&
	           this.length == otherTrack.length;
	}

}
