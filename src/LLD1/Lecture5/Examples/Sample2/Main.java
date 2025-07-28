package LLD1.Lecture5.Examples.Sample2;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new SimpleRunnable());
        t.start();
    }
}
