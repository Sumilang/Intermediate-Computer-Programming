package Lab.Lab5;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter items price: ");
            int price = scanner.nextInt();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            int totalbill = price * quantity;
            System.out.println("Total bill: " + totalbill);

            System.out.print("Enter discount divisor: ");
            int discountDivisor = scanner.nextInt();

            try {
                int discount = totalbill / discountDivisor;
                int finalBill = totalbill - discount;

                System.out.println("Discount: " + discount);
                System.out.println("Final bill: " + finalBill);
                
            } catch (ArithmeticException e) {
                System.out.println("Cannot calculate discount: Division by zero.");
                System.out.println("Original total bill: " + totalbill);
            }
        } catch (InputMismatchException e) {
            System.out.println("]Invalid input! Please enter integers only.");
        } finally {
            System.out.println("Shopping completed.");
            scanner.close();
        }
    }
}

