package Ch_8.Derived_class;

public class ElectricCar extends Car {
   private int batteryLevel;

   public void setBatteryLevel(int levelToSet) {
      batteryLevel = levelToSet;
   }

   public void printBatteryLevel() {
      System.out.print("Battery: " + batteryLevel);
   }
}