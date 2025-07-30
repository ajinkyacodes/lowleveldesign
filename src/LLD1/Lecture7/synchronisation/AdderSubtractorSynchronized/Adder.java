package LLD1.Lecture7.synchronisation.AdderSubtractorSynchronized;

public class Adder implements Runnable {
    private Count count;


    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (count) {
                count.value += i;
                System.out.println("Adder value: " + count.value);
            }
        }
    }
}
