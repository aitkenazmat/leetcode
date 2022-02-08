package example.thread.step;

public class Run {
    public static void main(String[] args) {
        Step step = new Step();
        new Thread(new RightThread(step)).start();
        new Thread(new LeftThread(step)).start();
    }
}
