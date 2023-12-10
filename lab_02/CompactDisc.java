//Pham Viet Hai - 20215044
package lab_02;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {

    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added: " + track.getTitle());
        } else {
            System.out.println("Track already exists: " + track.getTitle());
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed: " + track.getTitle());
        } else {
            System.out.println("Track not found: " + track.getTitle());
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    @Override
    public void play() {
        System.out.println("Playing CompactDisc: " + this.getTitle() + " by " + this.getArtist());
        System.out.println("Total Length: " + this.getLength());
        System.out.println("Tracks:");
        for (Track track : tracks) {
            track.play();
        }
    }
    
    @Override
    public String toString() {
        return "Media - Title: " + title + " | Category: " + category + " | Cost: " + cost + " $";
    }
}



