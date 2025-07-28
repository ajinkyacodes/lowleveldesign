package LLD1.Lecture6.concurrency.NumberPrinter;

public class NumberPrinter implements Runnable {
    private final int number;

    public NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Printing " + number + " by thread: " + Thread.currentThread().getName());
    }
}
