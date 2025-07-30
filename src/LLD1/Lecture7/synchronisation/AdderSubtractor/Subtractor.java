package LLD1.Lecture7.synchronisation.AdderSubtractor;

public class Subtractor implements Runnable {

    private Count count;


    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (count) {
                count.value -= i;
                System.out.println("Subtractor value: " + count.value);
            }
        }
    }
}
