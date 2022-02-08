package example.thread.step2;

public class Run {
    public static void main(String[] args) {
        Step step = new Step();
        new Thread(new Leg(step, "right")).start();
        new Thread(new Leg(step, "left")).start();
    }
}
