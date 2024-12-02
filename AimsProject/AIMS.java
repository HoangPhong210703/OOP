import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class AIMS {

    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        int option;
        do {
            System.out.println("AIMS: ");
            System.out.println("1. View store");
            System.out.println("2. Update store");
            System.out.println("3. See current cart");
            System.out.println("0. Exit");
            System.out.println("Please choose a number: 0-1-2-3");
            option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    storeMenu();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    cartMenu();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        } while (option != 0);
    }

    public static void storeMenu() {
        int option;
        do {
            System.out.println("Options: ");
            System.out.println("1. See a media's details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("Please choose a number: 0-1-2-3-4");
            option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    seeMediaDetails();
                    break;
                case 2:
                    addMediaToCart();
                    break;
                case 3:
                    playMedia();
                    break;
                case 4:
                    System.out.println("Current cart:");
                    cart.showCart();
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        } while (option != 0);
    }

    public static void seeMediaDetails() {
        System.out.print("Enter the title of the media: ");
        String title = scanner.nextLine();
        Media media = store.getMediaByTitle(title);

        if (media != null) {
            System.out.println("Media details: ");
            System.out.println(media.toString());
            mediaDetailsMenu(media);
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void mediaDetailsMenu(Media media) {
        int option;
        do {
            System.out.println("Options: ");
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.println("Please choose a number: 0-1-2");

            option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    cart.addMedia(media);
                    System.out.println("Media added to cart.");
                    break;
                case 2:
                    media.play();
                    break;
                case 0:
                    System.out.println("Returning to store menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        } while (option != 0);
    }

    public static void addMediaToCart() {
        System.out.print("Enter the title of the media to add to the cart: ");
        String title = scanner.nextLine();
        Media media = store.getMediaByTitle(title);

        if (media != null) {
            cart.addMedia(media);
            System.out.println("Media added to cart.");
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void playMedia() {
        System.out.print("Enter the title of the media to play: ");
        String title = scanner.nextLine();
        Media media = store.getMediaByTitle(title);

        if (media != null) {
            media.play();
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void updateStore() {
        int option;
        do {
            System.out.println("Update Store: ");
            System.out.println("1. Add media");
            System.out.println("2. Remove media");
            System.out.println("0. Back");
            System.out.println("Please choose a number: 0-1-2");
            option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    addMediaToStore();
                    break;
                case 2:
                    removeMediaFromStore();
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        } while (option != 0);
    }

    public static void addMediaToStore() {
        System.out.print("Enter media title: ");
        String title = scanner.nextLine();
        System.out.print("Enter media type (1 for CD, 2 for DVD, 3 for Book): ");
        int type = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (type) {
            case 1:
                store.addMedia(new CompactDisc(title));
                break;
            case 2:
                store.addMedia(new DigitalVideoDisc(title));
                break;
            case 3:
                store.addMedia(new Book(title));
                break;
            default:
                System.out.println("Invalid type.");
                return;
        }
        System.out.println("Media added to store.");
    }

    public static void removeMediaFromStore() {
        System.out.print("Enter the title of the media to remove: ");
        String title = scanner.nextLine();
        boolean removed = store.removeMedia(title);

        if (removed) {
            System.out.println("Media removed from store.");
        } else {
            System.out.println("Media not found in store.");
        }
    }

    public static void cartMenu() {
        int option;
        do {
            System.out.println("Options: ");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("Please choose a number: 0-1-2-3-4-5");

            option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    filterMediasInCart();
                    break;
                case 2:
                    sortMediasInCart();
                    break;
                case 3:
                    removeMediaFromCart();
                    break;
                case 4:
                    playMediaFromCart();
                    break;
                case 5:
                    placeOrder();
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        } while (option != 0);
    }

    public static void filterMediasInCart() {
        System.out.println("Filter by: ");
        System.out.println("1. By ID");
        System.out.println("2. By Title");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        switch (choice) {
            case 1:
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                cart.filterById(id);
                break;
            case 2:
                System.out.print("Enter title: ");
                String title = scanner.nextLine();
                cart.filterByTitle(title);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void sortMediasInCart() {
        System.out.println("Sort by: ");
        System.out.println("1. By Title");
        System.out.println("2. By Cost");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        switch (choice) {
            case 1:
                cart.sortByTitle();
                break;
            case 2:
                cart.sortByCost();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void removeMediaFromCart() {
        System.out.print("Enter the title of the media to remove: ");
        String title = scanner.nextLine();
        cart.removeMedia(title);
        System.out.println("Media removed from cart.");
    }

    public static void playMediaFromCart() {
        System.out.print("Enter the title of the media to play: ");
        String title = scanner.nextLine();
        cart.playMedia(title);
    }

    public static void placeOrder() {
        System.out.println("Order placed successfully!");
        cart.clearCart();
    }
}
