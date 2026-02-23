package algorithms.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Main {

    int total = 0;

    public static void main(String[] args) {

        MyTask myTask = new MyTask();


        try {
            ExecutorService service = Executors.newFixedThreadPool(5);
            Future<?> submit = service.submit(myTask);
            submit.get();

            System.out.println("---");



        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    static class MyTask implements Runnable {


        @Override
        public void run() {
            try {
                Thread.sleep(5000);
                System.out.println("Thread name : " + Thread.currentThread().getId());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
