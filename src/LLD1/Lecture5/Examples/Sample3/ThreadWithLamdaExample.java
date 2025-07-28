package LLD1.Lecture5.Examples.Sample3;

public class ThreadWithLamdaExample {
    public static void main(String[] args) {
        // Creating a thread with a Runnable implemented as a lambda expression
        Thread myThread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        // starting a thread
        myThread.start();
    }
}
