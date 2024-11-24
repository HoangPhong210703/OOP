package OOP.AimsProject;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int count;

    public Store(int capacity) {
        itemsInStore = new DigitalVideoDisc[capacity];
        count = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (count >= itemsInStore.length) {
            System.out.println("Store is full");
            return;
        }
        itemsInStore[count++] = dvd;
        System.out.println("DVD [" + dvd.getTitle() + "] added to the store");
    }

    public void removeDVD(String title) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (itemsInStore[i].getTitle().equalsIgnoreCase(title)) {
                found = true;
                System.out.println("DVD [" + itemsInStore[i].getTitle() + "] removed from the store");
                for (int j = i; j < count - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[--count] = null;
                break;
            }
        }
        if (!found) {
            System.out.println("DVD [" + title + "] not found in the store");
        }
    }

    public void displayStore() {
        System.out.println("*********************** STORE ************************");
        if (count == 0) {
            System.out.println("Empty");
        } else {
            for (int i = 0; i < count; i++) {
                DigitalVideoDisc dvd = itemsInStore[i];
                System.out.printf("Title: [%s] - Category: [%s] - Director: [%s] - Length: [%d] - Price: [$%.2f]\n",
                        dvd.getTitle(), dvd.getCategory(), dvd.getDirector(), dvd.getLength(), dvd.getCost());
            }
        }
        System.out.println("***********************************************************");
    }
}
