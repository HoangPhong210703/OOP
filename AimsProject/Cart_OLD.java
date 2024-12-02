

public class Cart_OLD {
    
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

    //Overload 1
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for (DigitalVideoDisc dvd : dvdList) {
            if (qytOrdered < MAX_NUMBER_ORDERED) {
                itemsOrdered[qytOrdered] = dvd;
                qytOrdered += 1;
                System.out.println("Item added: " + dvd.getTitle());
            } else {
                System.out.println("The cart is full");
                break;
            }
        }
    }

    //Overload 2
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qytOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qytOrdered] = dvd1;
            qytOrdered += 1;
            System.out.println("Item added: " + dvd1.getTitle());
        } else {
            System.out.println("The cart is full");
            return;
        }

        if (qytOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qytOrdered] = dvd2;
            qytOrdered += 1;
            System.out.println("Item added: " + dvd2.getTitle());
        } else {
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

    public float totalCostSelected(DigitalVideoDisc[] dvd_list){
        float total = 0;

        for (int i=0; i<dvd_list.length; i++){
            total += dvd_list[i].getCost();
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

    public void searchByIdDigitalVideoDisc(int[] idList) {
        boolean found = false; 
        double totalCost = 0;  
    
        System.out.println("*********************** CART ************************");
    
        for (int id : idList) { 
            boolean idFound = false; 
            for (int i = 0; i<qytOrdered; i++) {
                if (itemsOrdered[i].getId() == id) {
                    idFound = true;
                    found = true; 
                    totalCost += itemsOrdered[i].getCost();
    
                    String[] arr = itemsOrdered[i].toStringArr();
                    System.out.printf(
                        "ID " + arr[0] + ". DVD - [" + arr[1] + "] - [" + arr[2] + "] - [" + arr[3] + "] - [" + arr[4] + "]: [$" + arr[5] + "]\n"
                    );
                    break; 
                }
            }
            if (!idFound) {
                System.out.println("ID " + id + ". not found");
            }
        }
    
        if (found) {
            System.out.printf("Total cost: $%.2f\n", totalCost);
        } else {
            System.out.println("No DVDs found");
        }
        System.out.println("***************************************************************");
    }
    
    public void searchByTitleDigitalVideoDisc(String[] titleList) {
        boolean found = false;
        double totalCost = 0;
    
        System.out.println("*********************** CART ************************");
    
        for (String title : titleList) {
            boolean titleFound = false;
            for (int i = 0; i < qytOrdered; i++) {
                if (itemsOrdered[i].getTitle().equalsIgnoreCase(title)) {
                    titleFound = true;
                    found = true;
                    totalCost += itemsOrdered[i].getCost();
    
                    String[] arr = itemsOrdered[i].toStringArr();
                    System.out.printf(
                        "Title: [" + arr[1] + "] - Category: [" + arr[2] + "] - Director: [" + arr[3] + "] - Length: [" + arr[4] + "] - Price: [$" + arr[5] + "]\n"
                    );
                    break;
                }
            }
            if (!titleFound) {
                System.out.println("Title: [" + title + "] not found");
            }
        }
    
        if (found) {
            System.out.printf("Total cost: $%.2f\n", totalCost);
        } else {
            System.out.println("No DVDs found");
        }
        System.out.println("***************************************************************");
    }
    
    
}

