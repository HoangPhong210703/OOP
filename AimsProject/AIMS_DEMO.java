import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AIMS_DEMO{
    public static void main(String[] args) {

        ArrayList<Media> mediae = new ArrayList<Media>();


        mediae.add(new DigitalVideoDisc(0, "DVD", "Action", "Abc", 123, (float)9.99));
        mediae.add(new CompactDisc(1, "CD", "def", (float)42.22, 321));
        mediae.add(new Book(2, "Book", "Action", (float)9.12, Arrays.asList("qwerty", "abcdef")));
        for (Media media : mediae) {
            System.out.println(media.toString());
        }


        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");


        Collections.sort(mediae, Media.COMPARE_BY_TITLE_COST);
        System.out.println("Sorted by Title Cost:");
        for (Media media : mediae) {
            System.out.println(media.toString());
        }
        Collections.sort(mediae, Media.COMPARE_BY_COST_TITLE);
        System.out.println("\nSorted by Cost Title:");
        for (Media media : mediae) {
            System.out.println(media.toString());
        }




        //Cart anOrder = new Cart();


        // DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion king", "Animation", "Rogger Allers", 97, 19.95f);
        // anOrder.addDigitalVideoDisc(dvd1);
        // DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars", "Science fiction", "George Lucas", 87, 24.95f);
        // anOrder.addDigitalVideoDisc(dvd2);
        //DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        //anOrder.addDigitalVideoDisc(dvd3);


        //Overload demo 
        // DigitalVideoDisc[] dvdList = {dvd2, dvd3};
        // anOrder.addDigitalVideoDisc(dvdList);

        // System.out.println("\n");
        // anOrder.addDigitalVideoDisc(dvd1, dvd2);
        


        // System.out.println("\n");
        // System.out.printf("Total cost: %.2f%n", anOrder.totalCost());

        // System.out.println("\n");
        // anOrder.displayCart();
        // anOrder.displayQty();
        
        // System.out.println("\n");
        // anOrder.removeDigitalVideoDisc(dvd1);

        // System.out.println("\n");
        // anOrder.displayCart();
        // anOrder.displayQty();
        
        // System.out.println("\n");
        // System.out.printf("Total cost: %.2f%n", anOrder.totalCost());
        // System.out.println("\n");



        //Search fucntion demo
        // int id_list[] = {0, 1, 2, 999};
        // anOrder.searchByIdDigitalVideoDisc(id_list);

        // System.out.println("\n");

        // String title_list[] = {"The lion king", "Star wars", "abcabc"};
        // anOrder.searchByTitleDigitalVideoDisc(title_list);


    }
}