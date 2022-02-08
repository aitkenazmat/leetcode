package example.thread.step;

public class RightThread implements Runnable{
    private Step step;
    public RightThread(Step step) {
        this.step = step;
    }

    @Override
    public void run() {
        synchronized (step) {
            for (int i = 0; i < 5; i++) {
                step.notifyAll();
                System.out.println("Right..." + i);
                try {
                    step.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
