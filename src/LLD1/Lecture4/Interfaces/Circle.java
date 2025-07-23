package LLD1.Lecture4.Interfaces;

public class Circle implements Drawable, Runnable {

    @Override
    public void draw() {
        System.out.println("Draw a circle with it's specific radius");
    }

    @Override
    public void run() {
        System.out.println("Draw a circle with runnable radius");
    }
}
