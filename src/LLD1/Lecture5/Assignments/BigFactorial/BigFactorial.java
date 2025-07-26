package LLD1.Lecture5.Assignments.BigFactorial;

import java.math.BigInteger;

public class BigFactorial extends Thread {
    private final int number;
    private BigInteger factorial;

    public BigFactorial(int number) {
        //todo
        this.number = number;
    }

    @Override
    public void run() {
        //todo
        factorial = BigInteger.valueOf(1);
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
    }

    public BigInteger getFactorial() {
        return factorial;
    }



    public static void main(String[] args) throws InterruptedException {
        BigFactorial calculator = new BigFactorial(100);
        calculator.start();
        calculator.join(); // Wait for the thread to finish

        System.out.println("Factorial of 100: " + calculator.getFactorial());
    }
}
