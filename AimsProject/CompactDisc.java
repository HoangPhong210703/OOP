import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{

    private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    
    public CompactDisc(int id, String title, String artist, float cost, int length) {
        super(id, title, cost, length);
        this.artist = artist;
        this.length = length;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (track != null && !tracks.contains(track)) {
            tracks.add(track);
            System.out.println(track.getTitle() + " added");
        }
    }

    public void removeTrack(Track track) {
        if (track != null && tracks.contains(track)) {
            tracks.remove(track);
            System.out.println(track.getTitle() + " removed");
        }
    }

    public int getLength(){
        for(Track track : tracks){
            length += track.getLength();
        }
        return length;
    }



    @Override
    public void play() {
        System.out.println("Playing CD: " + this.title + " by " + this.artist);
        System.out.println("Number of tracks: " + tracks.size());
        for (Track track : tracks) {
            track.play();
        }
    }
    public String toString(){
        return super.toString() + ", Artist: " + artist + ", Tracks: " + tracks.size();
    }

    
}

