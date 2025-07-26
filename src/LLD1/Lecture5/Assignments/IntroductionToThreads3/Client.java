package LLD1.Lecture5.Assignments.IntroductionToThreads3;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        TableCreator tc = new TableCreator(num);

        ScalerThread t1 = new ScalerThread(tc);
        t1.start();

        scanner.close();
    }
}
