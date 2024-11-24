package OOP.AimsProject;

public class AIMS{
    public static void main(String[] args) {

        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion king", "Animation", "Rogger Allers", 97, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars", "Science fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);


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
        int id_list[] = {0, 1, 2, 999};
        anOrder.searchByIdDigitalVideoDisc(id_list);

        System.out.println("\n");

        String title_list[] = {"The lion king", "Star wars", "abcabc"};
        anOrder.searchByTitleDigitalVideoDisc(title_list);


    }
}