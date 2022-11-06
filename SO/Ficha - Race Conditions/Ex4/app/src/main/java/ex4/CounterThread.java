package ex4;

public class CounterThread extends Thread {
    protected Counter counter = null;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {

        synchronized (counter) {
            for (int i = 0; i != 100; i++) {
                System.out.println(Thread.currentThread().getName() + counter.getNumber());
                counter.add(1);   
            }
        }

    }
}
