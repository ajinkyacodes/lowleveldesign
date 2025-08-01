package LLD1.Lecture7.Assignments.IntroductionToSynchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(10);

        counter.incValue(10);
        counter.decValue(5);
        System.out.println(counter.getValue());
    }
}
