public class EX2 implements Runnable {

    public void run() {
        String currentThread = Thread.currentThread().getName();
        System.out.println("["+currentThread+"] "+"Eu sou uma thread!");
    }

    public static void main(String[] args) {

        if (args.length > 1) {
            System.err.println("Args > 1");
            System.exit(0);
        }
        int count = Integer.parseInt(args[0]);
        Thread[] thread = new Thread[count];

        for (int i = 0; i < count; i++) {
            EX2 ex2 = new EX2();
            thread[i] = new Thread(ex2);
            thread[i].setName("TH"+i);
            thread[i].start();
        }

    }

}
