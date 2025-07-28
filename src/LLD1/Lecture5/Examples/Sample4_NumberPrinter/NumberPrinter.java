package LLD1.Lecture5.Examples.Sample4_NumberPrinter;

public class NumberPrinter implements Runnable {
    private int number;

    public NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Printing " + number + " from " + Thread.currentThread().getName() + " Time: " + System.currentTimeMillis());
    }
}
