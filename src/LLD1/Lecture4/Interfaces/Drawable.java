package LLD1.Lecture4.Interfaces;

public interface Drawable {
    // A constant variable (implicitly public static final)
    String MEDIA_TYPE = "IMAGE";

    // An abstract method (implicitly public abstract)
    // by default abstract. No need to write as: abstract void draw()
    void draw();

}
