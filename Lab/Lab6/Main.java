package Lab.Lab6;

class InvalidBonusException extends Exception {
    public InvalidBonusException(String message) {
        super(message);
    }
}

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }

    public double calculateBonus(double percent) throws InvalidBonusException {
        if (percent < 0 || percent > 30) {
            throw new InvalidBonusException("Error: Bonus percentage must be between 0 and 30.");
        }
        return salary * percent / 100.0;
    }
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager: " + name + ", Salary: " + salary);
    }

    @Override
    public double calculateBonus(double percent) throws InvalidBonusException {
        return super.calculateBonus(percent) + 500.0;
    }
}

class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void displayInfo() {
        System.out.println("Developer: " + name + ", Salary: " + salary);
    }

    @Override
    public double calculateBonus(double percent) throws InvalidBonusException {
        return super.calculateBonus(percent) + 300.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Manager("Alice", 8000);
        Employee emp2 = new Developer("Brian", 6000);
        Employee emp3 = new Developer("Carla", 6500);

        double percent1 = 10;
        double percent2 = 25;
        double percent3 = 40;

        Employee[] employees = {emp1, emp2, emp3};
        double[] percentages = {percent1, percent2, percent3};

        try {
            for (int i = 0; i < employees.length; i++) {
                employees[i].displayInfo();
                double bonus = employees[i].calculateBonus(percentages[i]);
                System.out.println("Bonus: " + bonus + "\n");
            }
        } catch (InvalidBonusException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Processing complete.");
        }
    }
}
