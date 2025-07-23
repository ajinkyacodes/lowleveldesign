package LLD1.Lecture2.Assignments;

public class Math {
    // write code for Math class here
    static double PI = 3.14;

    // Area of circle
    public static double getCircleArea(int radius) {
        double area = PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        System.out.println(getCircleArea(10));
    }
}
