package CH_11.Interfaces2;

import java.util.Scanner;

public class Person implements HouseType {
   private String name;
	private String houseType;

   public void setInformation(String name, String houseType) {
      this.name = name;
		this.houseType = houseType;
   }

   @Override
    public String getNewHome() {
        return name + " moved into a new " + houseType + ".";
    }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Person person = new Person();
      String personName;
      String personHouseType;

      personName = scnr.next();
      personHouseType = scnr.next();

      person.setInformation(personName, personHouseType);
      System.out.println(person.getNewHome());
   }
}
