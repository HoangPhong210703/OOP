import java.util.Comparator;


abstract class Media {
    int id;
    String title;
    String category;
    float cost;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();    
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();


    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(int id, String title, float cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    
    @Override
    public String toString() {
        return "Title: " + title + ", Cost: " + cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Media)) {
            return false;
        }

        Media other = (Media) obj;

        return this.title != null && this.title.equals(other.title);
    }

}
