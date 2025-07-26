package LLD1.Lecture5.Assignments.IntroductionToThreads3;

public class TableCreator implements Runnable {

    int num;

    public TableCreator(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.num + " times " + i + " is " + this.num * i);
        }
    }
}
