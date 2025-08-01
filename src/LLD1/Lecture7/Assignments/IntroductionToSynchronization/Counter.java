package LLD1.Lecture7.Assignments.IntroductionToSynchronization;

public class Counter {
    private int count;

    public Counter(int count) {
        this.count = count;
    }

    synchronized public void incValue(int offset) {
        count = count + offset;
    }

    synchronized public int getValue() {
        return count;
    }

    synchronized public void decValue(int offset) {
        count = count - offset;
    }
}
