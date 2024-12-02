
import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    
    private List<String> authors = new ArrayList<String>();


    public Book(int id, String title, String category, float cost, List<String> authors) {
        super(id, title, category, cost);
        this.authors = authors;
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
    public List<String> getAuthors() {
        return authors;
    }


    public void addAuthor(String author) {
        if (author != null && !author.trim().isEmpty() && !authors.contains(author)) {
            authors.add(author);
            System.out.println(author + " added");
        }
    }
    

    public void removeAuthor(String author){
        if (author != null && !author.trim().isEmpty() && authors.contains(author)) {
            authors.remove(author);
            System.out.print(author + " removed");
        }
    }

    
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
    @Override
    public String toString() {
        return super.toString() + ", Author: " + authors;
    }
        
}
