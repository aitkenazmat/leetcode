package task;

import java.util.Random;
import java.util.concurrent.Callable;

public class Producer implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 105;
    }
}
