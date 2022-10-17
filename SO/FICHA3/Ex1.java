public class Ex1 extends Thread {

    public void run() {
        System.out.println("Eu sou uma thread!");
    }

    public static void main(String[] args) {
    
if(args.length >1){
    System.err.println("Args > 1");
    System.exit(0);
}

     for(int i=0;i<Integer.parseInt(args[0]);i++){
         (new Ex1()).start();
     }

    }

}
