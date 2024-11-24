package OOP.AimsProject;

public class DigitalVideoDisc {

    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    

    private static int nbDigitalVideoDiscs = 0;

    
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

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;

        this.id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs++;
        
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;

        this.id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;

        this.id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;

        this.id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs++;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    
}


