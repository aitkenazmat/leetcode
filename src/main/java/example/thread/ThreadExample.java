package example.thread;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        ToDo object = new ToDo(false,false);
        new Thread(new ReadBookThread(object)).start();
        Thread.sleep(5000);
        new Thread(new LeetcodeThread(object)).start();
    }
}
