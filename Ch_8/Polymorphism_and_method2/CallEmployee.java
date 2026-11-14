package Ch_8.Polymorphism_and_method2;

import java.util.ArrayList;

public class CallEmployee {
   public static void main(String[] args) {
      Employee person1;
      Professor person2;
      Coach person3;

      ArrayList<Employee> personList = new ArrayList<Employee>();
      int i;

      person1 = new Employee();
      person1.setName("Amy");

      person2 = new Professor();
      person2.setName("Mary");
      person2.setSubject("Art");

      person3 = new Coach();
      person3.setName("Liam");
      person3.setSport("baseball");

      personList.add(person1);
      personList.add(person3);
      personList.add(person2);

      for(i = 0; i < personList.size(); ++i){
         personList.get(i).printInfo();
      }
   }
}