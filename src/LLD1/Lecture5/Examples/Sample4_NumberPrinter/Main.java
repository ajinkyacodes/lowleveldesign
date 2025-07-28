package LLD1.Lecture5.Examples.Sample4_NumberPrinter;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i<100; i++){
            Thread myThread = new Thread(new NumberPrinter(i));
            myThread.start();
        }
    }
}
