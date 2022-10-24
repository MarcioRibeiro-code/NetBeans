public class Ex2 implements Runnable {

    private int i = 0;

    public Ex2(int i) {
        this.i = i;
    }

    public static void main(String[] args) {

        if (args.length > 1) {
            System.err.println("Args > 1");
            System.exit(0);
        }

        int priority = Integer.parseInt(args[0]);
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            Runnable r = new Ex2(i);
            Thread n = new Thread(r);
            n.setName("[TH" + i + "]");
            n.setPriority(priority--);
            n.start();
        }

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Eu sou uma thread!");

    }

}
