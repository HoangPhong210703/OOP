import java.util.Arrays;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd = new DigitalVideoDisc(0, "DVD 1", "Action", "Director 1", 123, (float) 9.99);
        Book book = new Book(1, "Book 1", "Action", (float) 9.99, Arrays.asList("Author 1", "Author 2", "Author 3"));
        CompactDisc cd = new CompactDisc(2, "CD 1", "Artist 1", (float) 9.99, 432);

        store.addMedia(dvd);
        store.addMedia(book);
        store.addMedia(cd);

        store.displayStore();

        store.removeMedia(book);
        store.displayStore();

        store.removeMedia(book);  
    }
}
