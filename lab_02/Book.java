// Pham Viet Hai 20215044
package lab_02;

import java.util.List;

public class Book extends Media {

    private List<String> authors;

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    // Phuong thuc add author
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author added: " + authorName);
        } else {
            System.out.println("Author already exists: " + authorName);
        }
    }

    // Phuong thuc remove author
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author removed: " + authorName);
        } else {
            System.out.println("Author not found: " + authorName);
        }
    }

    public Book() {
        // Default constructor
    }

    public Book(String title, List<String> authors, float cost) {
        this.title = title;
        this.authors = authors;
        this.cost = cost;
    }

    @Override
    public int compareTo(Media otherMedia) {
        // Compare by title
        return this.getTitle().compareTo(otherMedia.getTitle());
    }

    @Override
    public String toString() {
        return "Media - Title: " + title + " | Category: " + category + " | Cost: " + cost + " $";
    }
}

