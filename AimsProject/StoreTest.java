package OOP.AimsProject;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store(999);

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion king", "Animation", "Rogger Allers", 97, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars", "Science fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        
        System.out.println("\n");
        
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        store.displayStore();
        System.out.println("\n");

        store.removeDVD("Aladin");
        store.displayStore();
        System.out.println("\n");

        store.removeDVD("Abcabc");
        store.displayStore();
        System.out.println("\n");
    }
}
