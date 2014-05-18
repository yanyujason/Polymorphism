package bester;

public class Rectangle implements Bestable {
    private double length;
    private double breadth;

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    public double area() {
        return length * breadth;
    }

    @Override
    public boolean isBetterThan(Bestable bestable) {
        return this.area() > ((Rectangle) bestable).area();
    }
}
