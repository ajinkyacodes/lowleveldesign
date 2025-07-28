package LLD1.Lecture5.Examples.Sample1_MultipleThreads;

public class MultipleThreadsExample {
    public static void main(String[] args) {
        NewThread t1 = new NewThread();
        t1.setName("MyThread-1");
        NewThread t2 = new NewThread();
        t1.setName("MyThread-2");
        t1.start();
        t2.start();
    }
}
