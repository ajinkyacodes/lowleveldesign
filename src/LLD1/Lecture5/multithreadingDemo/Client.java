package LLD1.Lecture5.multithreadingDemo;

public class Client {
    public static void main(String[] args) {

        System.out.println("Current thread name: " + Thread.currentThread().getName());

        // New thread
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t = new Thread(helloWorldPrinter);
        t.start();

        System.out.println("DONE!!");
    }
}
