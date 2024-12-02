import java.util.ArrayList;


public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;

    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBER_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("Added: " + media.getTitle());
        } else {
            System.out.println("The cart is full");
        }
    }
    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("Removed: " + media.getTitle());
        } else {
            System.out.println("Item not found");
        }
    }
    public void displayCart() {
        System.out.println("*********************** CART ************************");
        for (Media media : itemsOrdered) {
            System.out.println(media.toString());
        }
        System.out.println("***************************************************");
    }
    public double totalCost() {
        double total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void showCart() {
        if (itemsOrdered.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Current Cart: ");
            for (Media media : itemsOrdered) {
                System.out.println(media.toString());
            }
        }
    }
}
