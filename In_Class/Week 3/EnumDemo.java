package week3;

public class EnumDemo {
	enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // 2. Use a variable of enum type
        Day today = Day.WEDNESDAY;
        System.out.println("Today is " + today);

        // 3. Switch on an enum
        switch (today) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("It's a weekday.");
        }

        // 4. Loop through all values
        System.out.println("\nAll days:");
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }

}
