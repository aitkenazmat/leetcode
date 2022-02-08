package example;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ForkJoinExample {

    static int numOfThreads = Runtime.getRuntime().availableProcessors();
    static long numOfTOperation = 10_000_000_000L;

    public static void main(String[] args) {


        IntStream stream = IntStream.of(1, 2, 3, 4, 5);

//        stream.collect()


        System.out.println(numOfThreads);
        System.out.println(LocalDateTime.now());
//        long s=0;
//        for (long i = 0; i < 10_000_000_000L; i++) {
//            s+=i;
//        }

//        System.out.println(s);

        ForkJoinPool pool = new ForkJoinPool(numOfThreads);
        pool.invoke(new MyFork(0,numOfTOperation));
        System.out.println(LocalDateTime.now());
    }


    static class MyFork extends RecursiveTask<Long> {
        long from;
        long to;

        public MyFork(long from, long to) {
            this.from = from;
            this.to = to;
        }

        /**
         * The main computation performed by this task.
         *
         * @return the result of the computation
         */
        @Override
        protected Long compute() {

            if ( (to - from) <= numOfTOperation/numOfThreads) {

            } else {

                long middle = (to+from) /2;
            }
            return null;
        }
    }
}
