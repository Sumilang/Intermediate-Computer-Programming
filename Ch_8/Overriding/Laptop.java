package Ch_8.Overriding;

public class Laptop extends Computer {
   public void setWiFiStatus(String wifiStatus) {
      wifiQuality = wifiStatus;
   }

   @Override
   public void printStatus() {
      super.printStatus();
      System.out.println("WiFi: " + wifiQuality);
   }

   private String wifiQuality;
}