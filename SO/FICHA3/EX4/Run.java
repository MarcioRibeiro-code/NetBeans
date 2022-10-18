package EX4;

import java.util.concurrent.Semaphore;

public class Run extends Thread {
    public SharedObj share;

    // public Semaphore sm;

    public Run(SharedObj s) {
        share = s;
        // this.sm = sm;
    }

    public void run() {
        String myname = Thread.currentThread().getName();
        try {
            while (true) {

                if (Thread.interrupted()) {
                    return;
                }

                Thread.sleep(1000);
                System.out.println("[" + myname + "] Number:" + share.getNumber() + "(" + share.getName() + ")");
            }
        } catch (InterruptedException e) {
        }
    }

    public void setShare(SharedObj s) {
        share = s;
    }
}
