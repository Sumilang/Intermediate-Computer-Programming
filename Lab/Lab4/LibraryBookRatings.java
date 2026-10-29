package Lab.Lab4;
import java.util.Scanner;

public class LibraryBookRatings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many readers? ");
        int numReaders = input.nextInt();
        System.out.print("How many books? ");
        int numBooks = input.nextInt();
        System.out.println();

        int[][] ratings = new int[numReaders][numBooks];

        readRatings(ratings);

        System.out.println("\nRatings Matrix:");
        displayRatings(ratings);

        System.out.println("\nAverage rating per book:");
        for (int book = 0; book < numBooks; book++) {
            double avg = calculateBookAverage(ratings, book);
            System.out.printf("Book %d: %.1f\n", (book + 1), avg);
        }

        System.out.println("\nAverage rating per reader:");
        for (int reader = 0; reader < numReaders; reader++) {
            double avg = calculateReaderAverage(ratings, reader);
            System.out.printf("Reader %d: %.1f\n", (reader + 1), avg);
        }
    }

    public static void readRatings(int[][] ratings) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < ratings.length; i++) {
            for (int j = 0; j < ratings[i].length; j++) {
                System.out.printf("Enter rating (1-5) for Reader %d Book %d: ", (i + 1), (j + 1));
                ratings[i][j] = input.nextInt();
            }
        }
    }

    public static double calculateBookAverage(int[][] ratings, int book) {
        int sum = 0;
        for (int reader = 0; reader < ratings.length; reader++) {
            sum += ratings[reader][book];
        }
        return (double) sum / ratings.length;
    }

    public static double calculateReaderAverage(int[][] ratings, int reader) {
        int sum = 0;
        for (int book = 0; book < ratings[reader].length; book++) {
            sum += ratings[reader][book];
        }
        return (double) sum / ratings[reader].length;
    }

    public static void displayRatings(int[][] ratings) {
        for (int[] readerRatings : ratings) {
            for (int rating : readerRatings) {
                System.out.print(rating + " ");
            }
            System.out.println();
        }
    }
}