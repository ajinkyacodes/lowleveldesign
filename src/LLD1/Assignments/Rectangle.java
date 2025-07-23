package LLD1.Assignments;

public class Rectangle {
    // write the code of rectangle class here
    Point topLeft;
    int height;
    int width;

    // Area of Reactangle
    int getArea() {
        return this.height * this.width;
    }

    // Perimeter of Rectangle
    int getPerimeter() {
        return 2 * (this.height + this.width);
    }

    // Bottom Right of the Reacyangle
    Point getBottomRight() {
        Point obj = new Point();

        obj.x = this.topLeft.x + this.width;
        obj.y = this.topLeft.y - this.height;
        return obj;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.width = 3;
        rect.height = 4;

        rect.topLeft = new Point();

        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
        System.out.println(rect.getBottomRight());
    }
}
