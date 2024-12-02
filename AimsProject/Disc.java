

public class Disc extends Media {
    
    public String director;
    public int length;

    

    public Disc(int id, String title, String category, float cost, String director, int length) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }

    public Disc(int id, String title, float cost, String director, int length) {
        super(id, title, cost);
        this.director = director;
        this.length = length;
    }

    public Disc(int id, String title, float cost, int length) {
        super(id, title, cost);
        this.length = length;
    }


    // public Disc(int id, String title, String artist, float cost, int length) {
    //     super(id, title, cost, length);
    //     this.artist = artist;
    // }

    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    

    
    
}
