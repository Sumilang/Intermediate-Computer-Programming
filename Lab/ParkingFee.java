package Lab;
import java.util.Scanner;

public class ParkingFee {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String student;
    double hoursRate;
    double hours;
    double fee;

    System.out.print("Enter student name: ");
    student = scanner.nextLine();
    System.out.print("Enter hours parked: ");
    hours = scanner.nextDouble();

    if (hours <= 2) {
        hoursRate = 2.00;
    } 
    else if (hours <= 5) {
        hoursRate = 3.00;
    } 
    else {
        hoursRate = 4.00;
    } 
    fee = hoursRate * hours;

    System.out.println("\n------ PARKING RECEIPT ------\n");
    System.out.printf("%-18s%12s%n", "Student:", student);
    System.out.printf("%-18s%12d%n", "Hours Parked:", (int) hours);
    System.out.printf("%-18s%12s%n", "Rate per Hour:", String.format("$%.2f", hoursRate));
    System.out.printf("%-18s%12s%n", "Total Fee:", String.format("$%.2f", fee));

    scanner.close();
    }
}