package multitheading;

@SuppressWarnings("unused")
public class MultiThreadThing extends Thread {

    private final int threadNumber;

    public MultiThreadThing(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public int getThreadNumber() {
        return threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " from thread: " + this.threadNumber);

            if (threadNumber == 3)
                throw new RuntimeException();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {

            }
        }
    }


}
