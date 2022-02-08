package example.thread;

import java.time.LocalDateTime;

public class ReadBookThread implements Runnable{
    private ToDo object;
    public ReadBookThread(ToDo object) {
        this.object = object;
    }
    @Override
    public void run() {
        synchronized (object) {
            if (object.getSolvedProblem()) {
                System.out.println("leetcode already do, im reading hibernate");
                object.setReadBook(true);
            } else {
                try {
                    System.out.println("read book sleep");
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }



            System.out.println("im reading hibernate");
            object.setReadBook(true);
            System.out.println(LocalDateTime.now());
        }
    }
}
