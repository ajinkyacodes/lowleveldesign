package LLD1.Lecture5.Examples.Sample2_SimpleRunnable;

public class SimpleRunnable implements Runnable {
    @Override
    public void run() {
        // business logic
        System.out.println("Hello from new thread: "+ Thread.currentThread().getName()+" time: "+System.currentTimeMillis());
    }
}
