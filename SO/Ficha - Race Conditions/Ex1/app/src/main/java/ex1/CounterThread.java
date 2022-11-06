package ex1;
public class CounterThread extends Thread{
    protected Counter counter =null;
    public CounterThread(Counter counter){
        this.counter=counter;
    }

    public void run(){
        for(int i=0;i<10;i++){
            counter.add(1);
            System.out.println("Value: "+counter.count+". "+getName());
            try {
                
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
}
