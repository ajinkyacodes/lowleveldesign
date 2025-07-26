package LLD1.Lecture5.Assignments.IntroductionToThreads2;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        Adder a = new Adder(num1, num2);

        ScalerThread t1 = new ScalerThread(a);
        t1.start();

        scanner.close();
    }
}
