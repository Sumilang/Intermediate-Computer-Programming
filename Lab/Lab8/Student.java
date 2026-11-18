package Lab.Lab8;

public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public class Address {
        private String city;
        private String country;

        public Address(String city, String country) {
            this.city = city;
            this.country = country;
        }

        public String getFullAddress() {
            return city + ", " + country;
        }
    }

    public void displayDetails(Address address) {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Address: " + address.getFullAddress());
    }

    public static void main(String[] args) {
        Student student = new Student("Alex", 101);

        Student.Address address = student.new Address("Dallas", "USA");

        student.displayDetails(address);
    }
}
