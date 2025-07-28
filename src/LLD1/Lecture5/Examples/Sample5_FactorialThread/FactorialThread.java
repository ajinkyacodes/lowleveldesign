package LLD1.Lecture5.Examples.Sample5_FactorialThread;

import java.math.BigInteger;

public class FactorialThread extends Thread {
    private long number;
    private BigInteger result;
    private boolean isFinished;

    public FactorialThread(long number) {
        this.number = number;
        result = BigInteger.valueOf(0);
        isFinished = false;
    }

    @Override
    public void run() {
        // Business Logic
        result = factorial(number);
        isFinished = true;
    }

    BigInteger factorial(long n) {
        BigInteger ans = BigInteger.ONE;
        for (long i = 2; i <= n; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }

    BigInteger getResult() {
        return result;
    }

    boolean isFinished() {
        return isFinished;
    }
}
