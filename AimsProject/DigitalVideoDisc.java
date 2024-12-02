
public class DigitalVideoDisc extends Disc implements Playable{


    private int nbDigitalVideoDiscs = 0;

    
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public int getId() {
        return id;
    }

    public String[] toStringArr(){
        String [] arr =  {Integer.toString(id), title, category, director, Integer.toString(length), Float.toString(cost)};
        return arr;
    }

    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
        super(id, title, category, cost, director, length);

        this.id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs++;
        
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength()); 
    }

    public String toString(){
        return super.toString() + ", Length: " + length;
    }

    
    
}


