package LLD1.Lecture6.Assignments.ThreadsWithCallables2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    Node root;
    ExecutorService executorService;

    public TreeSizeCalculator(Node root, ExecutorService executorService) {
        this.root = root;
        this.executorService = executorService;
    }

    @Override
    public Integer call() throws Exception {
        if (root == null) return 0;

        TreeSizeCalculator lefttree = new TreeSizeCalculator(root.left, executorService);
        TreeSizeCalculator righttree = new TreeSizeCalculator(root.right, executorService);

        Future<Integer> ltreesize = executorService.submit(lefttree);
        Future<Integer> rtreesize = executorService.submit(righttree);

        return ltreesize.get() + rtreesize.get() + 1;
    }
}
