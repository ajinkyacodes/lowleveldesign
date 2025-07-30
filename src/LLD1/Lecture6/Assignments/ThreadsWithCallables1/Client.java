package LLD1.Lecture6.Assignments.ThreadsWithCallables1;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        ArrayCreator ac = new ArrayCreator(n);

        // Submit the main task and get the final result
        Future<List<Integer>> printListFuture = executorService.submit(ac);

        List<Integer> printedList = printListFuture.get();

        System.out.println(printedList);

        executorService.shutdown();
    }
}
