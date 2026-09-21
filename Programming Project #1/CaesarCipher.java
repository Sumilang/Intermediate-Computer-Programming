import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            System.out.print("Choose an option: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid choice. Please enter a number (1-3).\n");
                scanner.nextLine(); 
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    handleEncode(scanner);
                    break;
                case 2:
                    handleDecode(scanner);
                    break;
                case 3:
                    System.out.println("Exiting Caesar Cipher Tool. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.\n");
            }
        }

        scanner.close();
    }

    // Displays the main menu.
     
    public static void displayMenu() {
        System.out.println("=== Caesar Cipher Tool ===");
        System.out.println("1. Encode a message");
        System.out.println("2. Decode a message");
        System.out.println("3. Exit");
    }

    // Encoding the message.
     
    public static void handleEncode(Scanner scanner) {
        System.out.print("Enter your message: ");
        String message = scanner.nextLine();

        int shift = getValidShift(scanner);
        String encoded = encodeMessage(message, shift);

        System.out.println("Encoded message: " + encoded + "\n");
    }

    // Decoding the message.
    
    public static void handleDecode(Scanner scanner) {
        System.out.print("Enter your message: ");
        String message = scanner.nextLine();

        int shift = getValidShift(scanner);
        String decoded = decodeMessage(message, shift);

        System.out.println("Decoded message: " + decoded + "\n");
    }

    // Provided a valid integer shift value.
     
    public static int getValidShift(Scanner scanner) {
        while (true) {
            System.out.print("Enter shift value: ");
            if (scanner.hasNextInt()) {
                int shift = scanner.nextInt();
                scanner.nextLine(); 
                return shift;
            } else {
                System.out.println("Error: Shift value must be an integer.");
                scanner.nextLine(); 
            }
        }
    }

    // Normalizes shift values.
     
    public static int normalizeShift(int shift) {
        int normalized = shift % 26;
        if (normalized < 0) {
            normalized += 26;
        }
        return normalized;
    }

    // Encodes message by shifting letters.
    public static String encodeMessage(String message, int shift) {
        int effectiveShift = normalizeShift(shift);
        String result = "";

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            result += shiftCharacter(ch, effectiveShift);
        }

        return result;
    }

    // Decodes a message by reversing the shift.
    public static String decodeMessage(String message, int shift) {
        // Decoding is equivalent to encoding with the inverse shift
        int effectiveShift = normalizeShift(-shift);
        return encodeMessage(message, effectiveShift);
    }

    // Shifts an individual character while preserving case and non-letter characters.
    public static char shiftCharacter(char ch, int shift) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) ('A' + (ch - 'A' + shift) % 26);
        } else if (ch >= 'a' && ch <= 'z') {
            return (char) ('a' + (ch - 'a' + shift) % 26);
        } else {
            return ch;
        }
    }
}