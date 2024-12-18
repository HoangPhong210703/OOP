import java.util.ArrayList;



public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Added to store: " + media.getTitle());
    }

    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("Removed from store: " + media.getTitle());
        } else {
            System.out.println("Media not found in the store.");
        }
    }

    public void displayStore() {
        System.out.println("*********************** STORE ************************");
        for (Media media : itemsInStore) {
            System.out.println(media.toString());
        }
        System.out.println("********************************************************");
    }
    public Media getMediaByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }
}
