package LLD1.Lecture6.concurrency.NumberPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        // Create a pool with 10 threads
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 100; i++) {
            System.out.println("DEBUG");
            NumberPrinter task = new NumberPrinter(i);
            executorService.execute(task); // submitting my task to the pool
        }

        // it's crucial that we shut down the executor service
        // Otherwise, the application will not terminate
        executorService.shutdown();
    }
}

/*
Fixed size thread pool
When to use this type of thread pool?
Ideal for CPU-bound tasks -> Tasks where the number of threads are close to the
number of CPU cores.

Printing numbers with a fixed pool

Cached thread Pool:
This pool creates a new thread if no idle thread is available.

When to use it?
Excellent for short-lived, I/O bound tasks
e.g. handling requests in a web server where threads spend a lot of
time waiting for network or DB responses.

WARNING: A cached pool can grow without limit.
If tasks are long-running, then you end up creating a lot of threads
and running out of memory.

 */