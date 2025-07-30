package LLD1.Lecture6.Assignments.ThreadsWithCallables1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<List<Integer>> {

    private int num;
    private final List<Integer> numbers;

    public ArrayCreator(int num) {
        this.num = num;
        this.numbers = new ArrayList<>();
    }

    @Override
    public List<Integer> call() throws Exception {
        for (int i = 1; i <= this.num; i++) {
            this.numbers.add(i);
        }

        return this.numbers;
    }
}
