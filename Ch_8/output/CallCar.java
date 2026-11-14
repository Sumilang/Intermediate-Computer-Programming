package Ch_8.output;

public class CallCar {
   public static void main(String[] args) {
      Car myCar = new Car();
      ElectricCar electricCar = new ElectricCar();

      myCar.setBrand("Hyundai");
      myCar.setModel("Elantra");
      electricCar.setBrand("BMW");
      electricCar.setModel("i3");
      electricCar.setRange("190 miles");

      System.out.println(myCar);
      System.out.println(electricCar);
   }
}
