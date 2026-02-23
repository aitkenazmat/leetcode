package algorithms.thread.compleatableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class RunAsyncSupplyAsyncWithExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("exampleRunAsync-----------------------------");

        CompletableFuture<Void> cf = exampleRunAsync();
        // Блокировка и ожидание завершения Future
        System.out.println("Я работаю в главном потоке!!!" + " " + Thread.currentThread().getName());


        System.out.println("exampleSupplyAsync-----------------------------");
        CompletableFuture<String> stringCompletableFuture = exampleSupplyAsync();

    }

    public static CompletableFuture<String> exampleSupplyAsync() {

        ExecutorService es = Executors.newFixedThreadPool(1);
        return CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("thread name: " + Thread.currentThread().getName());
                return "Test";
            }
        }, es);
    }

    public static CompletableFuture<Void> exampleRunAsync() {
        ExecutorService es = Executors.newFixedThreadPool(1);
        return CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println("Я буду работать в отдельном потоке, а не в главном." + Thread.currentThread().getName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, es);
    }
}
