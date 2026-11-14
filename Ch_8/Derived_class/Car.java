package Ch_8.Derived_class;

public class Car extends Vehicle {
   public void printCarSpeed() {
      System.out.print("Driving at: ");
      printSpeed();
   }
}
