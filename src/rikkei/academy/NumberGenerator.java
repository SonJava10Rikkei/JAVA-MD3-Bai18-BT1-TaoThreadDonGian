package rikkei.academy;

public class NumberGenerator implements Runnable {
    private final String threadName;
    private Thread myyThread;

    public NumberGenerator(String name, int priority) {
        myyThread = new Thread(this, name);
        threadName = name;
        myyThread.setPriority(priority);
        System.out.println("My thread is created!" + myyThread);
        myyThread.start();
    }

    public Thread getMyThread() {
        return myyThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i < 11; i++) {
                System.out.println(threadName + "printing the count " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException i) {
            System.out.println("MY thread interupted");
        }
        System.out.println("My thread run is over");
    }
}
