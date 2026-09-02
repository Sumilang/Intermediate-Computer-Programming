package Lab;
import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int order = 0;
        double sale = 0.0;
        double amount;

        do {
            System.out.print("Enter order number (0 to finish): ");
            amount = scanner.nextDouble();

            if (amount > 0) {
                sale += amount; 
                order++;
            }
            
        } while (amount != 0);

        double averageOrder = (order != 0) ? sale / order : 0.0;
        
        System.out.println("\n------ DAILY SALES SUMMARY ------\n");
        System.out.printf("Number of Orders: %d%n", order);
        System.out.printf("Total sales:      $%.2f%n", sale);
        System.out.printf("Average Order:     $%.2f%n", averageOrder);
    }
}

