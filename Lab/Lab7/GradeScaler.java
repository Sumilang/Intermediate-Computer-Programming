package Lab.Lab7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class GradeScaler {
    public static void main(String[] args) {
        String inputFilename = "grades.txt";
        String outputFilename = "scaledGrades.txt";
        
        try (PrintWriter writer = new PrintWriter(new FileWriter(inputFilename))) {
            writer.println("45 50 60 70 80");
        } catch (IOException e) {
            System.out.println("Error creating input file.");
        }

        try (Scanner fileScanner = new Scanner(new File(inputFilename));
             PrintWriter outWriter = new PrintWriter(new FileWriter(outputFilename))) {
            
            while (fileScanner.hasNextInt()) {
                int grade = fileScanner.nextInt();
                int scaledGrade = grade * 2;
                outWriter.println(scaledGrade);
            }
            
            System.out.println("File '" + outputFilename + "' has been created with scaled values.");
            
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}