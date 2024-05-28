package algorithms.thread.compleatableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Simple {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> cf = getCf();
        String s = cf.get();
        System.out.println(s);
    }

    private static CompletableFuture<String> getCf() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("currentThread Id " + Thread.currentThread().getId());
        return CompletableFuture.completedFuture("s");
    }
}
