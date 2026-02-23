package algorithms.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Starter {


    public static void main(String[] args) {

        try {
            ExecutorService executorService = Executors.newFixedThreadPool(5);

            Future<?> submit = executorService.submit(new MyThread());
            submit.get();

            System.out.println("other task..");
            System.out.println("other task..");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    static class MyThread implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println("Started " + Thread.currentThread().getId());
                Thread.sleep(5000);
                System.out.println("finish " + Thread.currentThread().getId());
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }

        }
    }
}
