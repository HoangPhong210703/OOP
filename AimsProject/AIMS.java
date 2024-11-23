package TTUD.AimsProject;


public class AIMS{
    public static void main(String[] args) {
        

        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion king", "Animation", "Rogger Allers", 97, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars", "Science fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // System.out.println("\n----------");
        // System.out.printf("Total cost: %.2f%n", anOrder.totalCost());

        // System.out.println("\n----------");
        // anOrder.displayCart();
        // anOrder.displayQty();
        
        System.out.println("\n----------");
        anOrder.removeDigitalVideoDisc(dvd1);

        System.out.println("\n----------");
        anOrder.displayCart();
        anOrder.displayQty();
        
        System.out.println("\n----------");
        System.out.printf("Total cost: %.2f%n", anOrder.totalCost());
        System.out.println("\n----------");
    }
}