public class Ex1 implements Runnable {

    public void run() {
        System.out.println("Eu sou uma thread!");
    }

    public static void main(String[] args) {

        if (args.length > 1) {
            System.err.println("Args > 1");
            System.exit(0);
        }
        int count = Integer.parseInt(args[0]);
        Thread[] thread = new Thread[count];

        for (int i = 0; i < count; i++) {
            Ex1 ex1 = new Ex1();
            thread[i] = new Thread(ex1);
            thread[i].start();
        }

    }

}
