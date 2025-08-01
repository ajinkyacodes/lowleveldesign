package LLD1.Lecture7.Assignments.IntroductionToSynchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(10);

        for(int i=1; i<=10; i++) {
            counter.incValue(10);
            counter.decValue(5);
            counter.incValue(10);
            System.out.println(counter.getValue());
        }
    }
}
