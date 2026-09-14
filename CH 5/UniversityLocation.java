import java.util.Scanner;

public class UniversityLocation {

	public static void printUniversityLocation(String city, String university) {
		System.out.println(city + " is the location of " + university + " University.");
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

        String cityName1;
        String cityName2;
        String universityName1;
        String universityName2;

        cityName1 = scnr.next();
        cityName2 = scnr.next();
        universityName1 = scnr.next();
        universityName2 = scnr.next();

        printUniversityLocation(cityName1, universityName1);
        printUniversityLocation(cityName2, universityName2);

	}
}