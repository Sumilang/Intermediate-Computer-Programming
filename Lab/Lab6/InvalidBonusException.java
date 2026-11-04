package Lab.Lab6;

public class InvalidBonusException extends Exception {
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

