package TTUD.AimsProject;

public class Cart {
    
    public static final int MAX_NUMBER_ORDERED= 20;

    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qytOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){

        if (qytOrdered < MAX_NUMBER_ORDERED){
            itemsOrdered[qytOrdered] = disc;
            qytOrdered += 1;
            System.out.println("Item added");
        }
        else{
            System.out.println("The cart is full");
        }
    }
        
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){

        if (qytOrdered == 0){
            System.out.println("No item in cart");
        }

        for (int i = 0; i < qytOrdered; i++){
            if (itemsOrdered[i] == disc){

                for (int j = i; j < qytOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                System.out.println("Item removed");

                itemsOrdered[qytOrdered - 1] = null;
                qytOrdered -= 1;

                break;
            }
        }
    }

    public float totalCost(){
        float total = 0;

        for (int i=0; i<qytOrdered; i++){
            total += itemsOrdered[i].getCost();
        }

        return total;
    }

    public void displayQty(){
        System.out.printf("Qty ordered: %d", qytOrdered); 
    }

    public void displayCart() {
        if (qytOrdered == 0) {
            System.out.println("Cart is empty");
        } else {
            for (int i = 0; i < qytOrdered; i++) {
                DigitalVideoDisc disc = itemsOrdered[i];
                System.out.println("Title: " + disc.getTitle());
                System.out.println("Category: " + disc.getCategory());
                System.out.println("Director: " + (disc.getDirector() != null ? disc.getDirector() : "Null"));
                System.out.println("Length: " + (disc.getLength() != 0 ? disc.getLength() : "Null"));
                System.out.println("Cost: " + disc.getCost());
                System.out.println("---------");
            }
        }
    }



}

