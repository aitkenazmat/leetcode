package example.thread;

import java.time.LocalDateTime;

public class LeetcodeThread implements Runnable{
    private ToDo object;
    public LeetcodeThread(ToDo object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object) {
            System.out.println("im solving problem in leetcode");
            System.out.println(LocalDateTime.now());
            object.setSolvedProblem(true);
            object.notify();
        }
    }
}
