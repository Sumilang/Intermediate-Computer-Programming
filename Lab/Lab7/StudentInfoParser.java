package Lab.Lab7;

import java.util.Scanner;

public class StudentInfoParser {
    public static void main(String[] args) {
        String studentData = "Alice Johnson ComputerScience 3";
        
        Scanner scanner = new Scanner(studentData);
        
        String firstName = scanner.next();
        String lastName = scanner.next();
        String major = scanner.next();
        int year = scanner.nextInt();
        
        scanner.close();
        
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Major: " + major);
        System.out.println("Year: " + year);
    }
}