package CH_11.Interfaces;

public class Person implements Food, Car {
   private String name;
	private String allergy;
	private String carColor;

   public void setInformation(String name) {
      this.name = name;
   }

	@Override
	public void setAllergy(String allergy) {
		this.allergy = allergy;
		System.out.println(this.name + " is allergic to " + allergy + ".");
	}

	@Override
	public void purchaseCar(String carColor) {
		this.carColor = carColor;
		System.out.println(this.name + " purchased a " + carColor + " car.");
	}

   public static void main(String[] args) {
      Person person = new Person();

      person.setInformation("Moe");
		person.setAllergy("kohlrabi");
		person.purchaseCar("white");
   }   
}