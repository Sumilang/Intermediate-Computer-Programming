package CH_11.Interfaces3;

import java.util.Scanner;

public class Person implements Education {
   private String name;
	private String fieldOfStudy;

   public void setInformation(String name, String fieldOfStudy) {
      this.name = name;
		this.fieldOfStudy = fieldOfStudy;
   }

   @Override
   public void printDegree() {
		System.out.println(name + " has a degree in " + fieldOfStudy + ".");
	}

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Person person = new Person();
      String personName;
      String personFieldOfStudy;
   
      personName = scnr.next();
      personFieldOfStudy = scnr.next();
   
      person.setInformation(personName, personFieldOfStudy);
      person.printDegree();
   }
}