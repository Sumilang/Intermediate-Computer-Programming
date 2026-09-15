import java.util.Scanner;

public class PrizeFinder {

    public static String findLotteryPrize(int lotteryNumber) {
        String prize;
    
        if (lotteryNumber == 320 || lotteryNumber == 331) {
            prize = "6500";
        } else if (lotteryNumber == 841 || lotteryNumber == 904) {
            prize = "17000";
        } else {
            prize = "0";
        }
    
        return prize;
    }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int lotteryNumber;

      lotteryNumber = scnr.nextInt();

      System.out.println(findLotteryPrize(lotteryNumber));
   }
}
