package LLD1.Lecture5.Assignments.IntroductionToThreads;

public class Client {
    public static void main(String[] args) {
        System.out.println("I am the main class");

        // Adder Thread
        Adder a = new Adder();
        ScalerThread t1 = new ScalerThread(a);
        t1.start();

        // Subtractor Thread
        Subtractor s = new Subtractor();
        ScalerThread t2 = new ScalerThread(s);
        t2.start();
    }
}
