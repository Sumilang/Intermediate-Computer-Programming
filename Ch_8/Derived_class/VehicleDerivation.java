package Ch_8.Derived_class;

public class VehicleDerivation {
   public static void main(String[] args) {
      ElectricCar myCar = new ElectricCar();

      myCar.setSpeed(30);
      myCar.setBatteryLevel(5);

      myCar.printCarSpeed();
      System.out.println();
      myCar.printBatteryLevel();
   }
}