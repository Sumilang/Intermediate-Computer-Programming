package Lab.Lab8;

interface Billable {
    double getCost();
}

class Circle implements Billable {
    private double radius;
    private double ratePerUnit;

    public Circle(double radius, double ratePerUnit) {
        this.radius = radius;
        this.ratePerUnit = ratePerUnit;
    }

    @Override
    public double getCost() {
        return radius * ratePerUnit;
    }
}

class Rectangle implements Billable {
    private double length;
    private double width;
    private double ratePerUnit;

    public Rectangle(double length, double width, double ratePerUnit) {
        this.length = length;
        this.width = width;
        this.ratePerUnit = ratePerUnit;
    }

    @Override
    public double getCost() {
        return length * width * ratePerUnit;
    }
}

public class ShapeBillingDemo {
    public static void main(String[] args) {
        Billable circle = new Circle(15.0, 10.0);
        Billable rectangle = new Rectangle(10.0, 4.0, 5.0);

        double circleCost = circle.getCost();
        double rectangleCost = rectangle.getCost();
        double totalCost = circleCost + rectangleCost;

        System.out.println("Circle cost: " + circleCost);
        System.out.println("Rectangle cost: " + rectangleCost);
        System.out.println("Total cost: " + totalCost);
    }
}
