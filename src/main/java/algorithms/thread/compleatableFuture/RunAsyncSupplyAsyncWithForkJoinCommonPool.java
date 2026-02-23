package algorithms.thread.compleatableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class RunAsyncSupplyAsyncWithForkJoinCommonPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("exampleRunAsync-----------------------------");

        CompletableFuture<Void> cf = exampleRunAsync();
         // Блокировка и ожидание завершения Future
        cf.get();
        System.out.println("Я работаю в главном потоке!!!" + " " +Thread.currentThread().getName());


        System.out.println("exampleSupplyAsync-----------------------------");
        CompletableFuture<String> stringCompletableFuture = exampleSupplyAsync();
        String s = stringCompletableFuture.get();
        System.out.println(s);

    }

    public static CompletableFuture<String> exampleSupplyAsync() {
        return CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                return "Test";
            }
        });
    }

    public static CompletableFuture<Void> exampleRunAsync() {
        return CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                try {
                    //Thread.sleep(5000);
                    System.out.println("Я буду работать в отдельном потоке, а не в главном." + Thread.currentThread().getName());
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
