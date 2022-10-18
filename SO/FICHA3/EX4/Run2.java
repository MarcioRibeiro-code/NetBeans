package EX4;

import java.util.concurrent.Semaphore;

public class Run2 extends Thread {
    public SharedObj share;
    public volatile int n;
    BinarySemaphore bSemaphore;

    public Run2(SharedObj s, int i,BinarySemaphore sm) {
        share = s;
        n = i;
        bSemaphore = sm;
    }

    public  void run() {
       
        try {
            bSemaphore.waitForNotify();
            Thread.sleep(1000);
            String myname = Thread.currentThread().getName();
            share.setNumber(n);
            System.out.println(("[ " + myname + "]" + " (Number : " + share.getNumber() + ")"));
            share.setName(" share.name definido por :" + myname);
            bSemaphore.notifyToWakeup();
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
    }

    public void setShare(SharedObj s) {
        share = s;
    }

}
