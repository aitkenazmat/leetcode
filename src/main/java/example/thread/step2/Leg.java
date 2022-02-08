package example.thread.step2;

public class Leg implements Runnable {
    private Step step;
    private String name;

    public Leg(Step step, String name) {
        this.step = step;
        this.name = name;
    }

    @Override
    public void run() {
//        while (true) {
//
//        }
        synchronized (step) {
            while (true) {
                step.notify();
                System.out.println(name);
                try {
                    step.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
