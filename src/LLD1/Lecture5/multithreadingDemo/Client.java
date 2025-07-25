package LLD1.Lecture5.multithreadingDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        System.out.println("Current thread name: " + Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter(10);

        // New thread (Old Way)
//        Thread t = new Thread(helloWorldPrinter);
//        t.start();


        // Better Way
        // Using Executor Service - basically using Thread pools
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=0; i<15; i++) {
            executorService.submit(helloWorldPrinter);
        }

        System.out.println("DONE!!");
        executorService.shutdown();
    }
}
