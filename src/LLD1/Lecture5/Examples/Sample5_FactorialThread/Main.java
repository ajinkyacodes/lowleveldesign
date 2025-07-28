package LLD1.Lecture5.Examples.Sample5_FactorialThread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Long> inputNumbers = Arrays.asList(100000000L, 3435L, 35435L, 2324L, 4656L, 23L, 5556L);
        List<FactorialThread> threads = new ArrayList<>();

        for (long number : inputNumbers) {
            FactorialThread t = new FactorialThread(number);
            threads.add(t);
        }

        for (Thread t : threads) {
            t.start();
        }

        for (Thread t : threads) {
            t.join(2000);
        }

        for (int i = 0; i < inputNumbers.size(); i++) {
            FactorialThread t = threads.get(i); // ith thread object
            if (t.isFinished()) {
                System.out.println("Factorial of " + inputNumbers.get(i));
                System.out.println();
                System.out.println(t.getResult());
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
            } else {
                System.out.println("Couldn't complete calc in 2s");
            }
        }
        System.out.println("Main is completed.");
    }
}
