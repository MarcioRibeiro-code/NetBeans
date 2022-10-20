package EX4;

public class doThreadSharing {
		
    public static void main(String args[]) {
		SharedObj share = new SharedObj();
		Thread tarefa = new Thread(new Run(share),"Printer_thread");
		BinarySemaphore bm = new BinarySemaphore(1);
		
		tarefa.start();	
		int priority=10;
		
		for(int i=0; i<10; i++){
			final int index=i;
			Thread tarefa2 = new Thread(new Run2(share,index,bm));
			tarefa2.setName("Numbered_thread_"+i);
			tarefa2.setPriority(priority--);
			tarefa2.start();

			}
		try{
		Thread.sleep(10000);
		tarefa.interrupt();
		} catch (InterruptedException e) {}
	}
}
