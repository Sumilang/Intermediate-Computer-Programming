package week3;

public class NumberTriangle {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {        // rows 1 → 5
            for (int col = 1; col <= row; col++) {  // print 1 → row
                System.out.print(col + " ");
            }
            System.out.println();                   // move to next line
        }
    }

}
