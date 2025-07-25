package LLD1.Lecture5.multithreadingDemo;

public class HelloWorldPrinter implements Runnable {

    private int number;

    public HelloWorldPrinter(int num) {
        this.number = num;
    }

    @Override
    public void run() {
        System.out.println("Number is: "+number);
        System.out.println("Hello world from new thread: "+ Thread.currentThread().getName()+" time: "+System.currentTimeMillis());
    }
}
