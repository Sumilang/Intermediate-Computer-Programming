package Ch_8.Overriding;

public class ClassOverridingEx {
   public static void main(String[] args) {
      Laptop myLaptop = new Laptop();

      myLaptop.setComputerStatus("30%", "connected");
      myLaptop.setWiFiStatus("bad");

      myLaptop.printStatus();

   }
}