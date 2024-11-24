package OOP.Lab01;
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("num1 = ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("num2 = ");
        double num2 = Double.parseDouble(scanner.nextLine());


        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    

        scanner.close();
    }
}