package LLD1.Lecture4.Assignments.ShapeClass;

public class Circle extends Shape {
    private double radius;

    public Circle(int positionX, int positionY, String fillColor, String borderColor, double radius) {
        super(positionX, positionY, fillColor, borderColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
