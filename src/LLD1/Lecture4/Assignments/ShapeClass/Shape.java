package LLD1.Lecture4.Assignments.ShapeClass;

public abstract class Shape {
    // write code here
    private int positionX;
    private int positionY;
    private String fillColor;
    private String borderColor;

    public Shape(int positionX, int positionY, String fillColor, String borderColor) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
