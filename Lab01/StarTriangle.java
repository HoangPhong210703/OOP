package OOP.Lab01;
import java.util.Scanner;

public class StarTriangle {

    public static void main(String[] args) {

        int n;
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Enter n: ");
            n = keyboard.nextInt();
        }

        String star = "*";
        String blank = " ";
        
        for (int i = 1; i <= n; i++) {

            for (int a = 1; a <= n-i; a++) {
                System.out.print(blank);
            }

            int star_nums = 2*(i-1) + 1;
            for (int a = 1; a <= star_nums; a++) {
                System.out.print(star);
            }

            for (int a = 1; a <= n-i; a++) {
                System.out.print(blank);
            }
            
            System.out.println();
            
            }
    }
    
}
