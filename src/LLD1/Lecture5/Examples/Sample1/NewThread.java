package LLD1.Lecture5.Examples.Sample1;

public class NewThread extends Thread {
    public void run() {
        // business logic
        System.out.println("Hello from new thread: "+ Thread.currentThread().getName()+" time: "+System.currentTimeMillis());
    }
}
