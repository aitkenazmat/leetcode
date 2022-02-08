package example.thread.step;

public class LeftThread implements Runnable{
    private Step step;
    public LeftThread(Step step) {
        this.step = step;
    }

    @Override
    public void run() {
        synchronized (step) {
            for (int i = 0; i < 5; i++) {
                step.notifyAll();
                System.out.println("Left..."+i);
                try {
                    step.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
