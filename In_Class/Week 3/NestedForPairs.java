package week3;

public class NestedForPairs {
	public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {          // outer loop: rows
            for (int col = 1; col <= 5; col++) {      // inner loop: columns
                System.out.print("(" + row + "," + col + ") ");
            }
            System.out.println(); // move to the next line after each row
        }
    }

}
