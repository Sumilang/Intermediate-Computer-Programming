package Lab.Lab4;
import java.util.Scanner;

public class JaggedExamScores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of classes: ");
        int numberOfClasses = input.nextInt();

        int[][] scores = createScoresArray(numberOfClasses);
        readScores(scores);

        System.out.println("\nScores Table:");
        displayScores(scores);
        System.out.println();

        for (int i = 0; i < scores.length; i++) {
            double avg = calculateClassAverage(scores[i]);
            System.out.printf("Average for class %d: %.1f\n", (i + 1), avg);
        }
    }

    public static int[][] createScoresArray(int numberOfClasses) {
        Scanner input = new Scanner(System.in);
        int[][] scores = new int[numberOfClasses][];

        System.out.println();
        for (int i = 0; i < numberOfClasses; i++) {
            System.out.print("How many quizzes for class " + (i + 1) + "? ");
            int numQuizzes = input.nextInt();
            scores[i] = new int[numQuizzes];
        }
        return scores;
    }

    public static void readScores(int[][] scores) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("\nEnter scores for class " + (i + 1) + ":");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print("Enter score " + (j + 1) + ": ");
                scores[i][j] = input.nextInt();
            }
        }
    }

    public static double calculateClassAverage(int[] classScores) {
        int sum = 0;
        for (int score : classScores) {
            sum += score;
        }
        return (double) sum / classScores.length;
    }

    public static void displayScores(int[][] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Class " + (i + 1) + ": ");
            for (int score : scores[i]) {
                System.out.print(score + " ");
            }
            System.out.println();
        }
    }
}