import java.util.Scanner;

public class TemperatureConversion {
   public static double fahrenheitToKelvin(int userFahrenheit) {
      
        return (userFahrenheit - 32) * 5.0 / 9.0 + 273.15;

   }
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int fahrenheit;
    
      fahrenheit = scan.nextInt();
      
      // Print with value rounded to 3 decimal places  
      System.out.printf("Kelvin: %.3f\n", fahrenheitToKelvin(fahrenheit));
   }
}