package OOP.Lab01;

import java.util.Scanner;


public class InputFromKeyboard {
    
    public static void main(String[] args) {

        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Whats your name");
            String strName = keyboard.nextLine();

            System.out.println("How old are you");
            int iAge = keyboard.nextInt();

            System.out.println("How tall are you");
            double dHeight = keyboard.nextDouble();

            System.out.println("Mr/Ms " + strName + ", " + iAge + " year old. Your height is " + dHeight );
        }


    }
}
