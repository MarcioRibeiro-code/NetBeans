package ex4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread threadI[] = new CounterThread[10];

        for (int i = 0; i < 10; i++) {
            threadI[i] = new CounterThread(c);
            threadI[i].setName("[TH" + i + "]: ");
            threadI[i].start();
        }

        for (int i = 0; i < 10; i++) {
            try {
                threadI[i].join();
            } catch (InterruptedException ie) {
            }
        }

        System.out.println("Impressão terminada");
    }
}
