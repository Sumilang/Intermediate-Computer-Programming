package Lab.Lab4;
import java.util.Scanner;

public class displayTemperatures {
    public static void main(String[] args) {
        int[] temps = new int[7];

        readTemperatures(temps);
        System.out.println();

        System.out.print("Temperatures: ");
        displayTemperatures(temps);
        System.out.println();

        int highestTemp = findHighest(temps);
        int lowestTemp = findLowest(temps);
        double averageTemp = calAverage(temps);

        System.out.printf("Highest: %d%n", highestTemp);
        System.out.printf("Lowest: %d%n", lowestTemp);
        System.out.printf("Average: %.1f%n", averageTemp);
    }

    public static void readTemperatures(int[] temps) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 7 daily high temperatures:");
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Temperature "+ (i + 1) + ": ");
            temps[i] = input.nextInt();
        }
    }

    public static int findHighest(int[] temps) {
        int highest = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > highest) {
                highest = temps[i];
            }
        }
        return highest;
    }

    public static int findLowest(int[] temps) {
        int lowest = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] < lowest) {
                lowest = temps[i];
            }
        }
        return lowest;
    }

    public static double calAverage(int[] temps) {
        int sum = 0;
        for (int i = 0; i < temps.length; i++) {
            sum += temps[i];
        }
        return (double) sum / temps.length;
    }

    public static void displayTemperatures(int[] temps) {
        for (int temp : temps) {
            System.out.print(temp + " ");
        }
    }
} 