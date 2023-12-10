//Pham Viet Hai - 20215044
package lab_02;

public abstract class Media implements Comparable<Media> {

    
    protected int id;
    protected String title;
    protected String category;
    protected float cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media() {
        // TODO Auto-generated constructor stub
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

        // Cast the object to Media
        Media otherMedia = (Media) obj;

        // Check if the titles are equal
        return this.title != null ? this.title.equals(otherMedia.title) : otherMedia.title == null;
    }

    // Method to check if the title of the media matches the given title
    public boolean isMatch(String searchTitle) {
        return this.title != null && this.title.equalsIgnoreCase(searchTitle);
    }
}

