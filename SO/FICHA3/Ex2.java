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

        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            Runnable r = new Ex2(i);
            new Thread(r).start();
        }

    }

    @Override
    public void run() {
        System.out.println("[TH" +this.i+ "]" + "Eu sou uma thread!");

    }

}
