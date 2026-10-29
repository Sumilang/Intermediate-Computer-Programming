package Lab.Lab5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentMarksLookup {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter student index: ");
            int index = scanner.nextInt();
            
            System.out.println("Student marks: " + marks[index]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer.");
        } finally {
            System.out.println("End of program");
            scanner.close();
        }
    }
}