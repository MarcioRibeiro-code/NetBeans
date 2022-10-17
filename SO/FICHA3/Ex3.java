public class Ex3 extends Thread {
    public void run() {
        try {

            for (int i = 0; i < 10; i++) {
                if(Thread.interrupted()){return;}
                System.out.println("Eu sou uma Thread");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        if (args.length > 1) {
            System.err.println("Args > 1");
            System.exit(0);
        }

        Ex3 Ex3 = new Ex3(); 
        Ex3.start();

        int time = Integer.parseInt(args[0])*1000;
        if (time > 0) {
            try {
                sleep(time);
               // System.out.print("a");
                Ex3.interrupt();
            } catch (InterruptedException e ) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

}
