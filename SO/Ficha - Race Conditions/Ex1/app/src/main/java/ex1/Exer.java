package ex1;
public class Exer {
    
    /** 
     * @param args
     */
    public static void main(String[] args){
        Counter counter = new Counter();
        Thread threadA = new CounterThread(counter);
        Thread threadB = new CounterThread(counter);
        
        threadA.start();
        try {
            Thread.sleep(100);
            threadA.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        threadB.start();
    }
}
