package Lab;
import java.util.Scanner;

public class PackageStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        enum DeliveryStatus {
            ORDERED,
            SHIPPED,   
            OUT_FOR_DELIVERY,
            DELIVERED
        }

        System.out.print("Enter delivery status: ");
        String input = scanner.nextLine().trim().toUpperCase();
        try {
                DeliveryStatus status = DeliveryStatus.valueOf(input);

                switch (status) {
                    case ORDERED:
                        System.out.println("Your order has been received.");
                        break;
                    case SHIPPED:
                        System.out.println("Your package has been shipped.");
                        break;
                    case OUT_FOR_DELIVERY:
                        System.out.println("Your package is out for delivery.");
                        break;
                    case DELIVERED:
                        System.out.println("Your package has been delivered.");
                        break;
                    }
                } catch (IllegalArgumentException e) {
                System.out.println("Invalid package status entered.");
            }
            scanner.close();

    }
}