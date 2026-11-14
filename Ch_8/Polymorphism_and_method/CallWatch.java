package Ch_8.Polymorphism_and_method;

import java.util.ArrayList;

public class CallWatch {
   public static void main(String[] args) {
      Watch watch1;
      SmartWatch watch2;
      SmartWatch watch3;

      ArrayList<Watch> watchList = new ArrayList<Watch>();
      int i;

      watch1 = new Watch();
      watch1.setHours(5);
      watch1.setMins(42);
      
      watch2 = new SmartWatch();
      watch2.setHours(14);
      watch2.setMins(39);
      watch2.setPercentage(45);

      watch3 = new SmartWatch();
      watch3.setHours(6);
      watch3.setMins(11);
      watch3.setPercentage(73);

      watchList.add(watch1);
      watchList.add(watch2);
      watchList.add(watch3);

      for(i = 0; i < watchList.size(); ++i) {
         watchList.get(i).printItem();
      }
   }
}
